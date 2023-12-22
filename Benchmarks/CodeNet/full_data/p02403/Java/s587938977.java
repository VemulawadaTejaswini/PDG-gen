import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		final String LINE_SEPARATOR = System.getProperty("line.separator");
		int H, W;
		while (true) {
			StringBuilder sb = new StringBuilder();
			String[] str = in.readLine().split(" ");
			H = Integer.parseInt(str[0]);
			W = Integer.parseInt(str[1]);
			if (H == 0 && W == 0)
				break;
			for (int i = 0; i < H; i += 1) {
				for (int j = 0; j < W; j += 1) {
					sb.append("#");
				}
				sb.append(LINE_SEPARATOR);
			}
			sb.append(LINE_SEPARATOR);
			System.out.print(sb);
		}
	}
}