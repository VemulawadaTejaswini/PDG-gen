import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		String ans = x < 1200 ? "ABC" : "ARC";
		System.out.println(ans);

		sc.close();
	}

}
