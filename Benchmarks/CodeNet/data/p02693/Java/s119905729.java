import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int k;
		int a, b;
		String message = "NG";
		Scanner scan = new Scanner(System.in);

		k = scan.nextInt();
		a = scan.nextInt();
		b = scan.nextInt();

		for(int i = a; i <= b; i++) {
			if(i % k == 0) {
				message = "OK";
				break;
			}
		}

		System.out.println(message);
	}
}
