import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int W = reader.nextInt();
		int H = reader.nextInt();
		if (W > 1) {
			W -= 2;
		}
		if (H > 1) {
			H -= 2;
		}
		int others = H * W; //back, 9
		System.out.println(others);
		reader.close();
	}
}
