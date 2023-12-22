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

		if (x == 0 || y == 0 || x == W || y == H || 2 * r > W || 2 * r > H) {
			System.out.println("No");

		} else {
			System.out.println("Yes");

		}

	}

}