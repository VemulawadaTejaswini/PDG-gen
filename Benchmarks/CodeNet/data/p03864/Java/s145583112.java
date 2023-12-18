import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		String[] str1 = br.readLine().split(" ");
		int[] a = new int [n];
		long cnt = 0;
		for(int i = 0; i < n; i++){
			int tmp = Integer.parseInt(str1[i]);
			if(tmp>x){
				cnt += tmp - x;
				tmp = x;
			}
			a[i] = tmp;
		}
		//safe case
		boolean f = true;
		for(int i = 0; i < n-1; i++){
			if(a[i]+a[i+1]>x){
				f = false;
				break;
			}
		}
		if(f){
			sb.append(cnt);
			System.out.println(sb);
			return;
		}

		//n=2
		if(n==2){
			if(a[0]+a[1]>x){
				int o = a[0]+a[1]-x; 
				cnt += o;
				sb.append(cnt);
				System.out.println(sb);
				return;
			}
		}

		//n>2
		for(int i = 1; i < n-1; i++){
			int a1 = a[i-1];
			int a2 = a[i];
			int a3 = a[i+1];

			if(a[i-1]+a[i]>x){
				int o = a1+a2-x; 
				cnt += o;
				a[i] -= o;
				if(a[i]<0){
					a[i-1] += a[i];
					a[i] = 0;
				}
			}
			if(a[i]+a[i+1]>x){
				int o = a2+a3-x;
				cnt += o; 
				a[i+1] -= o;
				if(a[i+1]<0){
					a[i] += a[i+1];
					a[i+1] = 0;
				}
			}
		}
		sb.append(cnt);
		System.out.println(sb);

	}
}