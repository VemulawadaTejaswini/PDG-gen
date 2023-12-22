import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int gole = sc.nextInt();
		int big = sc.nextInt();

		int ans = (gole / big) + (gole % big);

		System.out.println(ans);

	}

}