import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] H = new int[N];
		for(int i=0;i<N;i++){
			H[i] = stdIn.nextInt();
		}
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i=0;i<M;i++){
			A[i] = stdIn.nextInt();
			B[i] = stdIn.nextInt();
		}
		
		int good = 0;
		for(int i=0;i<M;i++){
			if(H[A[i]-1] > H[B[i]-1]){
				good++;
			}
		}
		
		System.out.println(good);
	}
}