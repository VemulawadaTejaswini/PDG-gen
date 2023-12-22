
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] str = line.split(" ");
		int W = Integer.parseInt(str[0]);
		int H = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		int y = Integer.parseInt(str[3]);
		int r = Integer.parseInt(str[4]);
		if (x - r > 0 && x + r < W && y - r > 0 && y + r < H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}