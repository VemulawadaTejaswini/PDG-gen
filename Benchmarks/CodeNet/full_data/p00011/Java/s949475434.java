import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[w];
		for (int i = 0; i < x.length; i++) {
			x[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			String[] ab = s.split(",");
			int a = Integer.parseInt(ab[0]) - 1;
			int b = Integer.parseInt(ab[1]) - 1;
			int c = x[a];
			x[a] = x[b];
			x[b] = c;
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}