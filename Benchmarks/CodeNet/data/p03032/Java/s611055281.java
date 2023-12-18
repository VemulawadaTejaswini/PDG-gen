

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Integer A = 0;
	static Integer B = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    
	    int V [] = new int [N];

	    for (int i=0;i<N;i++) {
	    	V[i]=sc.nextInt();
	    }
	    sc.close(); 
	    
		int[] L = new int[N+1];
		int[] R = new int[N+1];

		int l = 0;
		for (int i=0;i<N;i++) {
			l += V[i];
			L[i+1]=l;
		}
		
		int r = 0;

		for (int i=0;i<N;i++) {
			r += V[N-i-1];
			R[i+1]=r;
		}
	    
		
		int X = Math.min(N, K);
		int max = 0;
		int temp = 0;
		Queue <Integer> min = new PriorityQueue<Integer>();

		while (A+B<=X){
			A++;
			
			while (A+B<=X){
				temp = L[A]+R[B];
				
				
				for (int i=0; i<A;i++) {
					if (V[i]<0)
						min.add(V[i]);	
				}
				
				for (int i=0;i<B;i++) {
					//System.out.print(V[N-i-1]+" ");
					if (V[N-i-1]<0)
						min.add(V[N-i-1]);
					//System.out.println(min.peek());
				}
				//System.out.println(" ");
				
				/*for (int i=0; i<min.size()+1; i++){
					System.out.print(min.poll()+ " ");
						
				}
				System.out.println(" ");
				*/
				
				
				int cur = Math.min(min.size(), K-(A+B));
				for (int i=0; i<cur; i++){
					//System.out.println(min.peek());
					temp=temp-min.poll();
				}
				
				max = Math.max(temp,max);
				//System.out.println(A+" "+B+ " "+ max);
				B++;
				min.clear();
				
				
			}
			B=0;
		}
		System.out.println(max);
	}

}
