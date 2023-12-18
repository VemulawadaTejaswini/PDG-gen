import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		long[] H = new long[N];
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i=0; i<N; i++) {
			H[i] = s.nextLong();
		}
		for(int i=0; i<M; i++) {
			A[i]=s.nextInt();
			B[i]=s.nextInt();
		}
		int counter=0;
		for(int i=0; i<N; i++) {	
			boolean juge = true;
			for(int j=0; j<M; j++) {
				if(i == A[j]) {
					if(H[i] <= H[B[i]] ) {
						juge = false;
						break;
					}
				}
				else if(i == B[j]) {
					if(H[i] <= H[A[i]] ) {
						juge = false;
						break;
					}
					
				}
				counter++;
		    }
		}
			System.out.println(counter);	
			
			
		
			
		
		
	
	

}

}
