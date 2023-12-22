
// Submitted By SUbhash Yadav

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;


public class Main
{ static class Interval { 
    int buy, sell; 
} 
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
		int a[]=sc.readArray(n);
         long ans=1000;
         int count = 0; 
         
         // solution array 
         ArrayList<Interval> sol = new ArrayList<Interval>(); 
   
         // Traverse through given a array 
         int i = 0; 
         while (i < n - 1) { 
             // Find Local Minima. Note that the limit is (n-2) as we are 
             // comparing present element to the next element. 
             while ((i < n - 1) && (a[i + 1] <= a[i])) 
                 i++; 
   
             // If we reached the end, break as no further solution possible 
             if (i == n - 1) 
                 break; 
   
             Interval e = new Interval(); 
             e.buy = i++; 
            
             while ((i < n) && (a[i] >= a[i - 1])) 
                 i++; 
   
             // Store the index of maxima 
             e.sell = i - 1; 
             sol.add(e); 
   
             // Increment number of buy/sell 
             count++; 
         }
         if(count!=0)
        	 for(int j=0;j<count;j++)
        	 {
        		 int x=(int)ans/a[sol.get(j).buy];
        		 ans=ans%a[sol.get(j).buy];
        		 ans+=x*a[sol.get(j).sell];
        	 }
        System.out.println(ans);
		
		
		}
		static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
}
}
