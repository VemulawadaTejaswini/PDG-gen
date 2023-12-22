

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
//
//		Scanner sc = new Scanner(System.in);
//		BigInteger n = sc.nextBigInteger();
//	      boolean flag=solve(n);
//	      if(flag==true)
//	        System.out.println("Yes");
//	      else
//	    	  System.out.println("No");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max=-1;
        long sum=0;
        for(int i=0; i<n; i++){
        	int k = Integer.parseInt(st.nextToken());
        	if(i==0) {
        		max=k;
        	}
        	else {
        		if(max>k) {
        			sum+=max-k;
        			k=max;
        		}
        		else {
        			max=Math.max(k, max);
        		}
        	}
        }
        System.out.println(sum);
        
	        
	}

	

}
