import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		long cnt = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			long v = Long.parseLong(br.readLine());
			if(v==0){
				a[i] = 0;
				continue;
			}
			long e = v%2==0 ? v/2 -1 : v/2;
			cnt += e;
			a[i] = (int)(v-e*2);
		}
		for(int i = 1; i < n-1; i++){
			int v1 = a[i-1];
			int v2 = a[i];
			int v3 = a[i+1];
			if(v1==1 && v2==1){
				a[i-1]--;
				a[i]--;
				cnt++;
			}else if(v2==1 && v3==1){
				a[i]--;
				a[i+1]--;
				cnt++;
			}else if(v1==1 && v2==2 && v3==1){
				a[i-1]--;
				a[i]-=2;
				a[i+1]--;
				cnt+=2;
			}
		}
		for(int i = 0; i < n; i++){
			if(a[i]==2)
				cnt++;
		}
		sb.append(cnt);
		System.out.println(sb);
	}
}