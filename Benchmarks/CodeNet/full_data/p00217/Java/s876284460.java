import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	private void doit() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int max = 0;
			int p = 0;
			while (n-- != 0) {
				int x = sc.nextInt();
				int d = sc.nextInt() + sc.nextInt();
				if (max < d) {
					max = d;
					p = x;
				}
			}
			System.out.println(p + " " + max);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}