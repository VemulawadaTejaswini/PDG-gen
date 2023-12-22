import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		for(int i=K; i<N; i++) {
			pw.println(A[i]>A[i-K] ? "Yes" : "No");
		}
		
		sc.close();
		pw.close();
	}
}
