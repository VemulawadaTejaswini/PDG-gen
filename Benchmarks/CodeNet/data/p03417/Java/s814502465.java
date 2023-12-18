
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int W = reader.nextInt();
		int H = reader.nextInt();
		int others = Math.max(W-2, W % 2) * Math.max(H-2, H % 2); //back, 9
		System.out.println(others);
		reader.close();
	}
}
