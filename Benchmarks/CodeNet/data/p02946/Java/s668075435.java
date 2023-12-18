import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for (int i = x - k + 1; i <= x + k - 1; i++) {
			ans.append(i);
			ans.append(" ");
		}
		System.out.println(ans);
	}
}