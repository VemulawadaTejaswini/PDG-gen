import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		int ans = (b - a + 1) * (b - a) / 2 - b;
		System.out.println(ans);
	}
}
