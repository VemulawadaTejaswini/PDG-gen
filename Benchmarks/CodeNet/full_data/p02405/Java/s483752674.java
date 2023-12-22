import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		while (true) {
			String[] str = in.readLine().split(" ");
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			if (H == 0 && W == 0)
				break;
			StringBuilder sb = new StringBuilder();
			if (300 < H || 300 < W)
				throw new RuntimeException("range oger");
			for (int i = 0; i < H; i += 1) {
				for (int j = 0; j < W; j += 1) {
					if ((i + j) % 2 == 0) {
						sb.append("#");
					} else {
						sb.append(".");
					}
				}
				sb.append(System.getProperty("line.separator"));
			}
			out.println(sb);
		}
	}
}