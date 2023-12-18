import java.util.Scanner;

//AtCoder Beginner Contest 134
//B	Golden Apple
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		sc.close();

		int mod = N % (D * 2 + 1);
		int ans = N / (D * 2 + 1);
		if (mod != 0) {
			ans++;
		}

		System.out.println(ans);
	}
}
