import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] strings = line.split(" ");
		int W = Integer.parseInt(strings[0]);
		int H = Integer.parseInt(strings[1]);
		int x = Integer.parseInt(strings[2]);
		int y = Integer.parseInt(strings[3]);
		int r = Integer.parseInt(strings[4]);
		if (W >= x + r && H >= y + r && x - r >= 0 && y - r >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}