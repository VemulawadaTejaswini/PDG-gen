import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int H = Integer.parseInt(sa[0]);
		int W = Integer.parseInt(sa[1]);
		int h = Integer.parseInt(sa[2]);
		int w = Integer.parseInt(sa[3]);
		br.close();

		if (H % h == 0 && W % w == 0) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");

		int p = 1000000000;
		if (H % h != 0) {
			int nh = -(p / (h - 1) + 1);
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			sb1.append(p);
			sb2.append(nh);
			for (int j = 1; j < W; j++) {
				sb1.append(' ').append(p);
				sb2.append(' ').append(nh);
			}
			String s1 = sb1.toString();
			String s2 = sb2.toString();
			for (int i = 0; i < H; i++) {
				if (i % h == 0) {
					System.out.println(s1);
				} else {
					System.out.println(s2);
				}
			}

		} else {
			int nw = -(p / (w - 1) + 1);
			StringBuilder sb = new StringBuilder();
			sb.append(p);
			for (int j = 1; j < W; j++) {
				if (j % w == 0) {
					sb.append(' ').append(p);
				} else {
					sb.append(' ').append(nw);
				}
			}
			String s = sb.toString();
			for (int i = 0; i < H; i++) {
				System.out.println(s);
			}
		}
	}
}
