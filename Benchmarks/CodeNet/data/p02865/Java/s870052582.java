import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int n1 = n / 2;
		int cnt = 0;

		if (n % 2 == 0) {
			cnt = n / 2 - 1;
		} else {
			cnt = n / 2;
		}
		System.out.println(cnt);
		
	}

}
