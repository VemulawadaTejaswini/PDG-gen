import java.util.Scanner;

//AtCoder Beginner Contest 158
//B - Count Balls
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		sc.close();
		long m = N % (A+B);
		long ans = (N / (A+B)) * A;

		if (m > 0) {
			ans += Math.min(m, A);
		}
		System.out.print(ans);
	}
}
