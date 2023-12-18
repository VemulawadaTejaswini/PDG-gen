import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		long gap = 0;
		if (A%2 != 0 && B%2 != 0 && C%2 != 0) {
			long max = Math.max(A, Math.max(B, C));
			long min = Math.min(A, Math.min(B, C));
			long mid = A+B+C-max-min;
			long a = max/2;
			long b = max - a;
			gap = b*min*mid - a*min*mid;
		}
		System.out.println(gap);
	}
}