import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int ans = 0;
		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				ans++;
			}
		}

		System.out.println(ans);
		scan.close();
	}
}