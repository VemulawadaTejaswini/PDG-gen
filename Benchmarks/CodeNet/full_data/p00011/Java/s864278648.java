import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();

		int w = in.nextInt();
		int n = in.nextInt();

		for (int i = 1; i <= w; i++) {
			array.add(i);
		}

		//System.out.println(array);
		for (int j = 1; j <= n; j++) {
			String[] values = in.next().split(",");
			int a = Integer.parseInt(values[0]);
			int b = Integer.parseInt(values[1]);
			int c = array.get(a - 1);
			int d = array.get(b - 1);

			array.set(a - 1, d);
			array.set(b - 1, c);
		}

		for (int k = 0; k < w; k++) {
			int amida = array.get(k);
			System.out.println(amida);
		}
	}
}