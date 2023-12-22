import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		StringBuilder sb = new StringBuilder();

		while(true) {
			N--;
			sb.append((char)('a' + (N % 26)));
			if(N < 26) {
				break;
			}
			N /= 26;
		}

		System.out.println(sb.reverse().toString());

	}
}