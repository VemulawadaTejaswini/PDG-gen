import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int []A = new int[N+10];
		int []B = new int[N+10];
		int []C = new int[N+10];
		int []D = new int[N+10];
		int ans =0;
		
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		B[0]=0;
		B[1]=Math.abs(A[0]-A[1]);
		for(int i=0; i<N; i++){
			C[i] = B[i]+Math.abs(A[i+2]-A[i]);
			D[i] = B[i+1]+Math.abs(A[i+2]-A[i+1]);
			if(D[i]>C[i]){
				B[i+2] = C[i];
			} else {
				B[i+2] = D[i];
			}
		}
			System.out.println(B[N-1]);
	}
}