import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt(), sy = sc.nextInt();
		int tx = sc.nextInt(), ty = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append(repeat("R", tx-sx));
		sb.append(repeat("U", ty-sy));
		sb.append(repeat("L", tx-sx));
		sb.append(repeat("D", ty-sy+1));
		sb.append(repeat("R", tx-sx+1));
		sb.append(repeat("U", ty-sy+1));
		sb.append("LU");
		sb.append(repeat("L", tx-sx+1));
		sb.append(repeat("D", ty-sy+1));
		sb.append("R");
		System.out.println(new String(sb));
		sc.close();
	}
	public static String repeat(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) sb.append(str);
		return sb.toString();
	}
}