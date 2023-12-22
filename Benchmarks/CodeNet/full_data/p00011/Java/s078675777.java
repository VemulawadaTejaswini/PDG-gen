import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String amida;
		int ax, by, i;
		char a, b;
		while (sc.hasNext()) {
			int w = sc.nextInt();
			int n = sc.nextInt();
			int[] tate = new int[w];
			for (i = 1; i <= w; i++) {
				tate[i] = i;
			}
			for (i = 0; i < n; i++) {
				amida = sc.nextLine();
				a = amida.charAt(0);
				b = amida.charAt(2);
				ax = Integer.parseInt("" + a);
				by = Integer.parseInt("" + b);
				int sub = tate[ax - 1];
				tate[ax - 1] = tate[by - 1];
				tate[by - 1] = sub;
			}
			for (i = 0; i < n; i++) {
				System.out.println(tate[i]);
			}
		}
	}
}