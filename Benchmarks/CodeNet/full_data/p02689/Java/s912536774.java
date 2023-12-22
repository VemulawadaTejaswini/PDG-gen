import java.util.ArrayList;
import java.util.Scanner;
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

		ArrayList<Integer> yokunai = new ArrayList<Integer>();
		for(int i=0; i<M; i++) {
			if(A[i] < B[i]) {
				if(!(yokunai.contains(A[i])))yokunai.add(A[i]);}
			else if(A[i] > B[i]) {
				if(!(yokunai.contains(B[i])))yokunai.add(A[i]);}
			else {
				if(!(yokunai.contains(A[i]))) {yokunai.add(A[i]);}
			    if(!(yokunai.contains(B[i]))) {yokunai.add(A[i]);}
			}


		}
		int ans = N - yokunai.size();
		System.out.println(ans);








   }

}