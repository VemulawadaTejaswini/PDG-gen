import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int c = 0;
		for (int i = 0; i < N; ++i) {
			sc.next();
			int s = sc.next().charAt(0) == '(' ? 1 : -1;
			c += sc.nextInt() * s;
			System.out.println(c == 0 ? "Yes" : "No");
		}
	}

}