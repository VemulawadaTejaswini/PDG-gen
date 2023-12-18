/*package whatever //do not write package name here */

import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;


class Main {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main (String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<n ;i++ ) {
		    arr[i] = ob.nextInt();
		}
		Arrays.sort(arr);
		int min_cost=Integer.MAX_VALUE;
		for (int j=arr[0];j<=arr[n-1] ;j++ ) {
		    int sum=0;
		    for (int i=0;i<n ;i++ ) {
		        sum+=(arr[i]-j)*(arr[i]-j);
		    }
		    min_cost=Math.min(min_cost,sum);
		}
		System.out.println(min_cost);
	    
	}
}