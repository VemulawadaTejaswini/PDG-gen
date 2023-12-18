import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		double ans;
		if (n % 2 == 0) {
			ans = 0.5;
		} else {
			ans = ((n / 2) + 1) / (double) n;
		}
		System.out.println(ans);

	}

}
