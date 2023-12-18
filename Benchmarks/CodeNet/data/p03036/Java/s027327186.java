import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int r = sc.nextInt();
		int d = sc.nextInt();
		int[] x = new int[11];
		x[0] = sc.nextInt();
		for (int i = 1; i < 11; i++) {
			x[i] = r * x[i - 1] - d;
			sb.append(x[i] + "\n");
		}
		System.out.print(sb);
	}
}
