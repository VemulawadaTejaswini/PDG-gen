import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.nextLine());
		int g = Integer.parseInt(sc.nextLine());

		System.out.println(g * 2 - r);

		sc.close();
	}
}