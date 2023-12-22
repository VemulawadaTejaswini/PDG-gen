import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static short[][] d;
	static final short INF = Short.MAX_VALUE;

	public static void main(String[] args) {

		PrintWriter out = new PrintWriter(System.out);
		Scanner scan = new Scanner(System.in);
		short n = scan.nextShort();
		d = new short[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				d[i][j] = i!=j ? INF : 0;
			}
		}
		for (int i = 0; i < n; i++) {
			short id = scan.nextShort();
			short c = scan.nextShort();
			for (int j = 0; j < c; j++) {
				d[id-1][scan.nextShort()-1]=1;
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					d[i][j] = (short)Math.min(d[i][j], d[i][k]+d[k][j]);
				}
			}
		}

		int p = scan.nextInt();
		for (int i = 0; i < p; i++) {
			short s = scan.nextShort();
			short g = scan.nextShort();
			short ttl = scan.nextShort();
			out.println(ttl<=d[s-1][g-1] || d[s-1][g-1]==INF ? "NA" : d[s-1][g-1]+1);
		}
		out.flush();
	}
}