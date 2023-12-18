import java.util.*;

public class Main {

	public static String toansString(int y, int x, int y2, int x2) {
		StringBuffer ans = new StringBuffer();
		ans.append(String.valueOf(y));
		ans.append(" ");
		ans.append(String.valueOf(x));
		ans.append(" ");
		ans.append(String.valueOf(y2));
		ans.append(" ");
		ans.append(String.valueOf(x2));

		return ans.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		int a[][] = new int[h][w];
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		List<String> ans = new ArrayList<String>();
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				if (a[i][j] % 2 != 0) {
					String tmp = "";
					a[i][j]--;
					if (j + 1 < w) {
						a[i][j + 1]++;
						tmp = toansString(i + 1, j + 1, i + 1, j + 2);
					} else {
						if (i + 1 < h) {
							a[i + 1][j]++;
							tmp = toansString(i + 1, j + 1, i + 2, j + 1);
						}
					}
					if (tmp.length() != 0)
						ans.add(tmp);
				}
			}
		}

		System.out.println(ans.size());
		for (String an : ans)
			System.out.println(an);
	}
}
