import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []A = new int[3];
		for(int i = 0; i < 3; i++) {
			A[i] = scan.nextInt();
		}
		scan.close();
		int ans = 0;

		// 0
		int t = Math.abs(A[1] - A[0]);
		t += Math.abs(A[2] - A[1]);
		ans = t;

		t = Math.abs(A[2] - A[0]);
		t += Math.abs(A[1] - A[2]);
		ans = Math.min(ans, t);

		// 1
		t = Math.abs(A[0] - A[1]);
		t += Math.abs(A[2] - A[0]);
		ans = Math.min(ans, t);

		t = Math.abs(A[2] - A[1]);
		t += Math.abs(A[0] - A[2]);
		ans = Math.min(ans, t);

		// 2
		t = Math.abs(A[0] - A[2]);
		t += Math.abs(A[1] - A[0]);
		ans = Math.min(ans, t);

		t = Math.abs(A[1] - A[2]);
		t += Math.abs(A[0] - A[1]);
		ans = Math.min(ans, t);




		System.out.println(ans);
	}
}