import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		String s[] = new String[h];
		for (int i = 0; i < h; ++i) {
			s[i] = sc.next();
		}
		sc.close();
		for (int i = 0; i < h; ++i) {
			StringBuffer tmp = new StringBuffer();
			for (int j = 0; j < w; ++j) {
				char t = s[i].charAt(j);
				int bom = 0;
				if (t == '.') {
					for (int k = j - 1; k <= j + 1; ++k) {
						if (k < 0 || k > w - 1)
							continue;
						for (int l = i - 1; l <= i + 1; ++l) {
							if (l < 0 || l > h - 1)
								continue;
							if (s[l].charAt(k) == '#')
								bom++;
						}
					}
					tmp.append(String.valueOf(bom));
				}else {
					tmp.append(t);
				}
			}
			s[i] = tmp.toString();
		}
		for (String i : s)
			System.out.println(i);
	}
}
