import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = Integer.parseInt(stdin.next());
		int A[] = new int[N+1];
		int B[] = new int[N];
		int sum = 0;

		for(int i=0;i<N+1;i++) {
			A[i] = Integer.parseInt(stdin.next());
		}
		for(int i=0;i<N;i++) {
			B[i] = Integer.parseInt(stdin.next());
		}

		
		for(int i=0;i<N;i++) {
			sum+=Math.min(A[i],B[i]);
			sum+=Math.min(A[i+1], B[i]-Math.min(A[i], B[i]));
		}
		
		out.println(sum);
		
		out.flush();
	}

}
