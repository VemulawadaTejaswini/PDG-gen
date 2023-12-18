import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] t = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(sc.next());
			ans += t[i];
		}
		int m = Integer.parseInt(sc.next());
		for (int i = 0; i < m; i++)
			out.println(ans - t[Integer.parseInt(sc.next()) - 1] + Integer.parseInt(sc.next()));
		out.flush();
	}
}