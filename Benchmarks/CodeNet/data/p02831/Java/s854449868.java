import java.util.Scanner;

//AtCoder Beginner Contest 148
//C	Snack
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		// ユークリッドの互除法
		int a = A;
		int b = B;
		if (A < B) {
			a = B;
			b = A;
		}
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		long x = A * B;
		System.out.println(x / b);
	}
}
