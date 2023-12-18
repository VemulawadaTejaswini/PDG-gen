import java.util.*;

public class Main {

	// t以上の値を持つ配列の要素を返す(setに対して)
	public static int setlowerbound(Set<Integer> s, int t) {
		int len = s.size();
		if (len <= 0)
			return Integer.MAX_VALUE;
		int tmp[] = new int[len];
		int i = 0;
		for (int j : s)
			tmp[i++] = j;
		int index = lowerbound(tmp, t);
		if (index < 0)
			return Integer.MAX_VALUE;
		return tmp[index];
	}

	// tより大きい値を持つ配列の要素を返す(setに対して)
	public static int setupperbound(Set<Integer> s, int t) {
		int len = s.size();
		if (len <= 0)
			return Integer.MAX_VALUE;
		int tmp[] = new int[len];
		int i = 0;
		for (int j : s)
			tmp[i++] = j;
		int index = upperbound(tmp, t);
		if (index < 0)
			return Integer.MAX_VALUE;
		return tmp[index];
	}

	// t以上の値を持つ配列の添え字を返す
	public static int lowerbound(int a[], int t) {
		int left = 0, right = a.length - 1;
		int m = 0;
		if (right < 0 || a[right] < t)
			return -1;

		while (left + 1 < right) {
			m = (right + left) / 2;
			if (a[m] <= t)
				left = m;
			else
				right = m;
		}
		if (a[left] < t)
			left = right;
		return left;
	}

	// tより大きい値を持つ配列の添え字を返す
	public static int upperbound(int a[], int t) {
		int left = 0, right = a.length - 1;
		int m = 0;
		if (a[right] <= t)
			return -1;

		while (left + 1 < right) {
			m = (right + left) / 2;
			if (a[m] <= t)
				left = m;
			else
				right = m;
		}
		if (a[left] <= t)
			left = right;
		return left;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set pos[] = new Set[26];
		for (int i = 0; i < 26; ++i) {
			pos[i] = new TreeSet<Integer>();
		}
		String s = sc.next();
		char copy[] = s.toCharArray();
		for (int i = 0; i < n; ++i) {
			int t = (int) (copy[i] - 'a');
			pos[t].add(i + 1);
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; ++i) {
			int type = sc.nextInt();
			if (type == 1) {
				int index = sc.nextInt();
				String c = sc.next();
				char tar = c.charAt(0);
				char cur = copy[index - 1];
				if (cur != tar) {
					int t = (int) (cur - 'a');
					pos[t].remove(index);
					copy[index - 1] = tar;
					t = (int) (tar - 'a');
					pos[t].add(index);
				}
			} else {
				int ans = 0;
				int l = sc.nextInt();
				int r = sc.nextInt();
				for (int j = 0; j < 26; ++j) {
					Set<Integer> cur = pos[j];
					if (cur.size() > 0) {
						int index = setlowerbound(cur, l);
						if (index <= r)
							ans++;
					}
				}
				System.out.println(ans);
			}
		}
		sc.close();
	}
}
