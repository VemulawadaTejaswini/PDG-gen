import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int A = reader.nextInt();
		int B = reader.nextInt();
		int T = reader.nextInt();
		int ans = B * (T / A);

		System.out.println(ans);
		reader.close();

	}
}



