import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int A = Integer.parseInt(sc.next());
	static int B = Integer.parseInt(sc.next());
	public static void main(String[] args) {
		int ansa =0, ansb = 0;
		if (N < A+B) {
			ansb = A+B-N;
		}
		ansa = Math.min(A, B);
		System.out.println(ansa+" "+ansb);
	}
}
