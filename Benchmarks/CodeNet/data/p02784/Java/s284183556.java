import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int n = scan.nextInt();
		int attack = 0;

		for (int i = 0; i < n; i++)
			attack += scan.nextInt();

		if (h <= attack) System.out.println("Yes");
		else System.out.println("No");

		scan.close();
	}
}