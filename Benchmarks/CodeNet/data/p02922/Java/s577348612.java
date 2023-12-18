import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int cnt = 1;
		int tap = 0;

		while (cnt < b) {
			tap++;
			cnt = cnt + (a - 1);
		}

		System.out.println(tap);
	}

}

