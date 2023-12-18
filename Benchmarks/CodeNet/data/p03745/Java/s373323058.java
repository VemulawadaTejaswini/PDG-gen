import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[100010];
		a[0] = sc.nextInt();
		int c = 1;
		for (int i = 1;i < n;i++) {
			int tmp = sc.nextInt();
			if (a[c-1]==tmp) continue;
			a[c++] = tmp;
		}
		List<Integer> l = new ArrayList<>();
		c = 0;
		int ret = 0;
		while (true) {
			int tmp = a[c++];
			if (tmp==0) {
				ret++;
				break;
			}
			l.add(tmp);
			if (l.size()<=2) continue;
			if (i(l)||d(l)) {
				l.remove(0);
				continue;
			} else {
				l.clear();
				l.add(tmp);
				ret++;
			}
		}
		System.out.println(ret);
	}

	private static boolean i(List<Integer> l) {
		for (int i = 1;i < l.size();i++) {
			if (l.get(i-1)>l.get(i)) return false;
		}
		return true;
	}
	private static boolean d(List<Integer> l) {
		for (int i = 1;i < l.size();i++) {
			if (l.get(i-1)<l.get(i)) return false;
		}
		return true;
	}
}
