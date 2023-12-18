import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String line = in.readLine();
		StringTokenizer tk = new StringTokenizer(line);
		out.println(solve(Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())));

		out.close();
		in.close();
	}

	static int solve(int x, int y) {
		if (x == y)
			return 0;
		if (x == -y)
			return 1;
		if (x > 0 && y > 0) {
			if (x > y) {
				return Math.abs(x - y) + 2;
			} else
				return Math.abs(x - y);
		} else {
			if (x < 0 && y < 0) {
				if (y > x) {
					return Math.abs(x - y);
				} else {
					return Math.abs(x - y) + 2;
				}
			} else {
				if (x > 0 && y < 0) {
					if (Math.abs(y) < x) {
						// System.out.println("ass");
						return x - Math.abs(y) + 2;
					} else {
						return x - y;
					}
				} else {
					if (x < 0 && y > 0) {
						if (Math.abs(x) < y) {
							return Math.abs((-x) - y)+2;
						} else {
							return (Math.abs(x) - y) + 1;
						}
					} else {
						if (x == 0) {
							if (y > 0) {
								
								return Math.abs(y);
							} else {
								return Math.abs(y) + 1;

							}
						} else if (y == 0) {
							if (y > 0) {
								return Math.abs(x) + 1;
							} else {
								return Math.abs(x);

							}
						}
					}
				}
			}
		}
		return -10;
	}
}
