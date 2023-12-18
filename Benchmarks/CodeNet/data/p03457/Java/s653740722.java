import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		int[] t = new int[count];
		int[] x = new int[count];
		int[] y = new int[count];

		boolean result = false;
		for (int i = 0; i < count; i++) {
			t[i] = Integer.parseInt(sc.next());
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
			if (i == 0) {
				if (t[i] >= x[i] + y[i] && t[i] % 2 == (x[i] + y[i] % 2)) {
					result = true;
				}
			} else {
				int second = t[i] - t[i - 1];
				int distX = Math.abs(x[i] - x[i - 1]);
				int distY = Math.abs(y[i] - y[i - 1]);

				if (second >= distX + distY && second % 2 == (distX + distY) % 2) {
					result = true;
				} else {
					result = false;
				}
			}
			if (!result) {
				break;
			}
		}
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
