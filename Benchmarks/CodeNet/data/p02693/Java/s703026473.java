import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		String ans = solve(k, a, b) ? "OK" : "NG";
		System.out.println(ans);

	}

	public static boolean solve(int k, int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i % k == 0)
				return true;
		}
		return false;
	}

}
