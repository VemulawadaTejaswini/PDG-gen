import java.util.Scanner;

//AtCoder Beginner Contest 158
//C - Tax Increase
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int ans = -1;
		for (int i = 0; i < 2000; i++) {
			if ((int)(i * 0.08) == A && ((int)(i * 0.1) == B)) {
				ans = i;
				break;
			}
		}
		System.out.print(ans);
	}
}
