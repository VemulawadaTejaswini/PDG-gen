import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(sc.next());
			int d = (k > x)? k - x : x - k;
			ans += 2 * ((x < d)? x : d);
		}
		out.println(ans);
		out.flush();
	}
}