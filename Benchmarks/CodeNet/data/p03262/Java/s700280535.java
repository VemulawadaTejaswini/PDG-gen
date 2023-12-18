import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = Math.abs(a - x);
		int gmf = b;
		for (int i = 1; i < n; i++) {
			int tmp = Math.abs(sc.nextInt() - x);
			gmf = getGmf(gmf, tmp);
		}
		System.out.println(gmf);
	}

	static int getGmf(
			int a,
			int b) {
		int tmp;
		while ((tmp = a % b) != 0) {
			a = b;
			b = tmp;
		}
		return b;
	}
}
