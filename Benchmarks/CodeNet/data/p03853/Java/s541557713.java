import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int High = 0;
		int Width = 0;
		String Preserved = "";
		ArrayList<String> Array = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		High = scan.nextInt();
		Width = scan.nextInt();

		for (int i = 0; i < High; i++) {
			Array.add(scan.next());
			Preserved = Array.get(Array.size() - 1);
			Array.add(Preserved);
		}

		for (int i = 0; i < 2 * High; i++) {
			System.out.println(Array.get(i));
		}
	}
}