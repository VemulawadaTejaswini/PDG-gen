import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		int cost = in.nextInt();
		in.close();
		int ans = age > 12 ? cost
				: age < 6 ? 0
				: cost / 2;
		System.out.println(ans);
	}

}