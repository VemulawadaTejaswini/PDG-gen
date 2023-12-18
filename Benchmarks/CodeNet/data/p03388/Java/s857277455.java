import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]);

			long x = Math.min(a, b);
			long y = Math.max(a, b);
			if (x == y) {
				pw.println((x - 1) * 2);
			} else if (x + 1 == y) {
				pw.println(x - 2 + y - 1);
			} else {
				long xy = x * y;
				long z = (long) Math.sqrt(xy);
				while (z * z >= xy) {
					z--;
				}
				long zx = z;
				long zy = z;
				if (zx * (zy + 1) < xy) {
					zy++;
				}
				pw.println(zx - 1 + zy - 1);
			}
		}
		pw.flush();
		br.close();
	}
}
