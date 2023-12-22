import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[] H = new int[N];
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i=0; i<N; i++) {
			H[i] = s.nextInt();
		}
		for(int i=0; i<M; i++) {
			A[i]=s.nextInt();
			B[i]=s.nextInt();
		}

		ArrayList<Integer> yokunai = new ArrayList<Integer>();
		for(int i=0; i<M; i++) {
			if(H[A[i]-1] <H[B[i]-1]) {
				if(!(yokunai.contains(A[i])))yokunai.add(A[i]);}
			
			else if(H[A[i]-1] > H[B[i]-1]) {
				if(!(yokunai.contains(B[i])))yokunai.add(A[i]);}
			
			else {
				if(!(yokunai.contains(A[i]))) {yokunai.add(A[i]);}
			    if(!(yokunai.contains(B[i]))) {yokunai.add(B[i]);}
			}


		}
		int ans = N - yokunai.size();
		System.out.println(ans);








   }

}
