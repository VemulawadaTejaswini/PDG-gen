import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		sc.close();
		int a = T / A;
		int ans = 0;
		for (int i = 0; i < a; i++) {
			ans += B;
		}
		System.out.println(ans);
	}
}
