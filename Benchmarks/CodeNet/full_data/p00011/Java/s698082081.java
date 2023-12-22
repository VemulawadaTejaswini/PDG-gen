import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int w = si(), n = si();
		int[] ary = new int[w];
		for (int i = 0; i < w; i++)
			ary[i]=i+1;
		for (int i = 0; i < n; i++) {
			String[] cons = scan.next().split(",");
			int p = Integer.parseInt(cons[0])-1, q = Integer.parseInt(cons[1])-1;
			int tmp = ary[p];
			ary[p] = ary[q];
			ary[q] = tmp;
		}
		for (int i = 0; i < w ; i++)
			out.println(ary[i]);
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}