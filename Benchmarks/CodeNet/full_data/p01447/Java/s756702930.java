import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int N = sc.nextInt();
		int ans = 0;
		while (N > 0) {
			++ans;
			N /= 3;
		}
		System.out.println(ans);
	}

}