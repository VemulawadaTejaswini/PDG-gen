import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;
		while (i < 10001) {
			String line = sc.nextLine();
			String[] array = line.split(" ");
			int x = Integer.parseInt(array[0]);
			int y = Integer.parseInt(array[1]);
			if (x == 0 && y == 0) {
				break;
			}
			Arrays.sort(array);
			System.out.println(array[0] + " " + array[1]);
			i++;
		}

	}

}