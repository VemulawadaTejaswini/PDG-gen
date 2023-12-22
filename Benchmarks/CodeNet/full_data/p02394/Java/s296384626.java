import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] array = line.split(" ");
		int W = Integer.parseInt(array[0]);
		int H = Integer.parseInt(array[1]);
		int x = Integer.parseInt(array[2]);
		int y = Integer.parseInt(array[3]);
		int r = Integer.parseInt(array[4]);

		if (x - r < 0 || x + r > W || y + r > H || y - r < 0) {
			System.out.println("No");

		}
		else if (x - r >= 0 && x + r <= W || y - r >= 0 && y + r <= H) {
			System.out.println("Yes");

		}

	}

}