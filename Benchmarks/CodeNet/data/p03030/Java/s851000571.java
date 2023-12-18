import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String[][] r = new String[n][3];
		for (int i = 0; i < n; i++) {
			r[i][0] = sc.next();
			r[i][1] = sc.next();
			r[i][2] = String.valueOf(i + 1);
		}
		Arrays.sort(r, (x, y) -> {
			if (x[0].compareTo(y[0]) < 0) {
				return -1;
			} else if (x[0].compareTo(y[0]) > 0) {
				return 1;
			} else {
				return -Integer.compare(Integer.parseInt(x[1]), Integer.parseInt(y[1]));
			}
		});
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i][2]);
		}
		sc.close();
	}
}