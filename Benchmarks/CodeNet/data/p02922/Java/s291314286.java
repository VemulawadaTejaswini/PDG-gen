import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 1;
		int diff = B - A;
		while (diff > 0) {
			ans++;
			diff -= (A - 1);
		}
		System.out.println(ans);
		sc.close();
	}
}