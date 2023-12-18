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
		int[] a = new int [n];
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(br.readLine());
		}
		long cnt = a[0] - 1;
		int max = 2;
		
		for(int i = 1; i < n; i++){
			if(max<a[i]){
				int c = a[i]%max==0 ? (int)Math.floor(a[i]/max)-1 : (int)Math.floor(a[i]/max);
				cnt += c;
				a[i] = 1;
			}
			max = Math.max(a[i]+1,max);
		}
		sb.append(cnt);
		System.out.println(sb);
	}
}