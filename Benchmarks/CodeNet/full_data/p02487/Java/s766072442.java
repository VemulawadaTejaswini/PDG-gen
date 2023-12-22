import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] in = br.readLine().split(" ");
			int H = Integer.parseInt(in[0]), W = Integer.parseInt(in[1]);
			if (H == 0 & W == 0) break;
			StringBuilder sb = new StringBuilder();
			for (int i = 0;  i < H; i++) {
				for (int j = 0; j < W; j++) sb.append((i==0 || j==0 || i==H-1 || j==W-1) ? '#' : '.');
				sb.append(System.getProperty("line.separator"));
			}
			System.out.println(sb);
		}
	}
}