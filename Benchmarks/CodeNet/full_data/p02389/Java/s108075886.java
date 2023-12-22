import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");

		int v = Integer.parseInt(k[0]);
		int v2 = Integer.parseInt(k[1]);
		int mawari = v * 2 + v2 * 2;
		int menseki = v * v2;
		System.out.print(menseki+" "+mawari);
		

	}
}