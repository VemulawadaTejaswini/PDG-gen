/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static long power(int[] arr, int ticket){
		PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		for(int n : arr){
			pq.add(n);
		}
		while(ticket>0){
			int larg = pq.poll();
			larg >>= 1;
		//	System.out.println(larg);
			pq.add(larg);
			ticket -=1;
		}
		Integer val = 0;
		long ans = 0;
		while((val=pq.poll())!=null){
			ans += val;
		//	System.out.println(ans);
		}
		
		return ans;

	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
      int m = scan.nextInt();
      int ticket = scan.nextInt();
      int[] arr = new int[m];
      for(int i=0;i<m;i++){
        arr[i] = scan.nextInt();
      }
      System.out.println(power(arr,ticket));
		
		// your code goes here
	}
}