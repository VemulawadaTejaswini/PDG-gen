import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int K = scan.nextInt();
			int[]A = new int[N];
			int[]B = new int[M];
			Deque<Integer>ade = new ArrayDeque<Integer>();
			Deque<Integer>bde = new ArrayDeque<Integer>();
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				//ade.addFirst(A[i]);
			
			}
			for(int i = 0;i<M;i++) {
					B[i] = scan.nextInt();
					//bde.addFirst(B[i]);
			}
			
			
			int count=0;
			long time=0;
			
			int a = 0;
			int b = 0;
			
			while(true) {
				if(a==N&&b==M) break;
				
				if(a==N) {
					if(time+B[b]>K)break;
					time+=B[b];
					count++;
					b++;
				}else if(b==M) {
					if(time+A[a]>K)break;
					time+=A[a];
					count++;
					a++;
				}else {
					int as = A[a];
					int bs = B[b];
					if(A[a]<=B[b]) {
						if(time+A[a]>K)break;
						time+=A[a];
						count++;
						a++;
					}else {
						if(time+B[b]>K)break;
						time+=B[b];
						count++;
						b++;
					}
				}
				/*
				System.out.println(time);
				System.out.println(a);
				System.out.println(b);
				*/
				
			}
			
			System.out.println(count);
			
			
			
			
			
			
		}
		
		
	}
		

}
