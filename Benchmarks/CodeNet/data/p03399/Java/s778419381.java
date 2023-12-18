import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int answer = 0;
		if (a < b) {
			answer += a;
		} else {
			answer += b;
		}
		if (c < d) {
			answer += c;
		} else {
			answer += d;
		}

		System.out.println(answer);
	}

}