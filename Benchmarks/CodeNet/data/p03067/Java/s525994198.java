import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String ans = "No";
		if ((a < c && c < b) || (b < c && c < a)) {
			ans = "Yes";
		}
		System.out.println(ans);
	}

}
