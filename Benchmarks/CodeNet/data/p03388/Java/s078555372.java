import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Q = scanner.nextInt();
		long [] A = new long[Q];
		long [] B = new long[Q];
		for(int i = 0; i < Q; i++) {
			A[i] = scanner.nextLong();
			B[i] = scanner.nextLong();
		}
		scanner.close();
		double score;
		for(int i = 0; i < Q; i++) {
			score = A[i] * B[i];
			if(A[i] > B[i]) {
				long t = A[i];
				A[i] = B[i];
				B[i] = t;
			}
			double C0 = Math.sqrt(score);
			long C = (long)Math.sqrt(score);
			if(C0 == C) {
				C = C -1;
			}
			if(A[i] == B[i] || A[i] + 1 == B[i]) {
				System.out.println(2 * A[i] - 2);
			}else if(C * (C + 1) >= score) {
				System.out.println(2* C - 2);
			}else {
				System.out.println(2* C - 1);
			}
		}
	}
}