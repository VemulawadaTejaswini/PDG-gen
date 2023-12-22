//package abc175;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] ip = br.readLine().split(" ");
		
		int[]ary = new  int[N];
		
		for(int i = 0 ; i < N ;i ++) {
			ary[i] = Integer.parseInt(ip[i]);
		}
		
		Arrays.sort(ary);
		
		long ans = 0;
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = i+1 ; j < N ; j++) {
				for(int k = j+1 ; k < N ; k++) {
					long a = ary[i];
					long b = ary[j];
					long c = ary[k];
					
					if(a!=b && b!=c && c != a) {
						if(a+b > c && b+c > a && a+c > b)
							ans++;
					}
				}
			}
		}
		
		System.out.println(ans);
	}
	
}
