import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String game = sc.next();
		int reqMoves = 0;
		for (int i = 0; i < game.length() - 1; i++) {
			if (game.charAt(i) != game.charAt(i + 1));
			reqMoves++;
		}
		System.out.println(reqMoves);
	}
}
