import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String s[] = line.split(" ", 0);
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			line = sc.nextLine();
			String s2[] = line.split(" ", 0);
			c.add(Integer.parseInt(s2[0]));
			b.add(Integer.parseInt(s2[1]));
		}
		int a[];
		int ans = 0;

		while (c.size() != 0) {
			a = new int[n - 1];
			for (int i = 0; i < c.size(); i++) {
				for (int j = c.get(i) - 1; j < b.get(i) - 1; j++) {
					a[j]++;
				}
			}
			int max = 0;
			int pos = 0;
			for (int i = 0; i < n - 1; i++) {
				if (max < a[i]) {
					max = a[i];
					pos = i;
				}
			}
			for (int i = 0; i < c.size(); i++) {
				if (c.get(i) - 1 <= pos && b.get(i) - 1 > pos) {
					c.remove(i);

					b.remove(i);
					i--;
				}
			}
          ans++;
		}
      System.out.println(ans);

	}
}