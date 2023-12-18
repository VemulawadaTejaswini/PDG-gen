import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		int ans = X - A;
		while (ans > B) {
			ans -= B;
		}
		System.out.println(ans);
		sc.close();
	}
}
