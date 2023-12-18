import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		String ans = 500 * k >= x ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}
}

