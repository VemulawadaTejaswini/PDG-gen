import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int sx = Integer.parseInt(sc.next());
		int sy = Integer.parseInt(sc.next());
		int tx = Integer.parseInt(sc.next());
		int ty = Integer.parseInt(sc.next());
		int h = ty - sy;
		int w = tx - sx;
		int[] c = {w, h, 1, h + 1, w + 1, h + 1, w, 1, w + 1, h + 1, 1};
		String[] s = {"R","U","R","D","L","U","R","U","L","D","R"};
		for (int i = 0; i < 11; i++)
			for (int j = 0; j < c[i]; j++)
				out.print(s[i]);
		out.flush();
	}
}