import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(Math.min(n, m) == 1) {
			System.out.println(Math.max(Math.max(n, m) - 2, 0));
		} else if(n * m < 9 || Math.min(n, m) == 2) {
			System.out.println(0);
		} else {
			System.out.println((n - 2) * (m - 2));
		}
	}
}
