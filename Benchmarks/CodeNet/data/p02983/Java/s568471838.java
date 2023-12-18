package com;

import java.util.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		long l = s.nextLong() , r = s.nextLong();
		
		long[] arr = new long[2020];
		Arrays.fill(arr, -1);
		
		long i = l;
		
		while( i <= r ){
			
			int rem = (int) (i%2019);
			if(arr[rem] != -1) break;
			arr[rem] = i;
			++i;
			
		}
		
		
		long ans = ((l%2019)*(r%2019))%2019;
		
		for( int i1 = 0;i1 < arr.length - 1;++i1){
			if(arr[i1] != -1 && arr[i1+1] != -1){
				long val = ((arr[i1]%2019)*(arr[i1+1]%2019))%2019;
				if(val < ans) ans = val;
			}
		}
		
		System.out.println(ans);
		
		
		
		
	}
	
	
}
