package atCoder;

import java.util.*;

public class atCoder {
	public static void main(String args[]) {
  		int sum = 0;
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
      	int N = in.nextInt();
       	int[] A = new int[N];
      
      	for(int i=0; i<N; i++) {
        	  A[i] = in.nextInt();
        }
      	
      	int remainder = K - A[N-1];
      	
      	ArrayList<Integer> intervals = new ArrayList<Integer>();
      	
      	for(int i=1; i<N; i++) {
      		intervals.add(A[i]-A[i-1]);
      	}
      	
      	intervals.add(remainder);
      	Collections.sort(intervals);
      	
      	for(int i=0; i<intervals.size(); i++) {
      		sum = sum + intervals.get(i);
      	}
      	
      	System.out.println(sum-intervals.get(intervals.size()-1));
	    
	}
}