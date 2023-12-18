import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		sc.close();

		int ans = X + Y / 2;
		System.out.println(ans);
	}
}