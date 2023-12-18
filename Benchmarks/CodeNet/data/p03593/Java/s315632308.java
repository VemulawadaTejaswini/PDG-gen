import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = br.readLine().toCharArray();
		}
		br.close();

		int c1 = 0;
		int c2 = 0;
		int c4 = (h / 2) * (w / 2);
		if (h % 2 == 1) {
			if (w % 2 == 1) {
				c1 = 1;
				c2 = (h / 2) + (w / 2);
			} else {
				c2 = w / 2;
			}
		} else {
			if (w % 2 == 1) {
				c2 = h / 2;
			}
		}

		int[] cnt = new int[26];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				cnt[a[i][j] - 'a']++;
			}
		}

		int x = 0;
		while (c4 >= 0 && c2 >= 0 && c1 >= 0 && x < 26) {
			if (cnt[x] >= 4) {
				cnt[x] -= 4;
				c4--;
			} else if (cnt[x] >= 2) {
				cnt[x] -= 2;
				c2--;
			} else if (cnt[x] >= 1) {
				cnt[x]--;
				c1--;
			} else {
				x++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (cnt[i] != 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
