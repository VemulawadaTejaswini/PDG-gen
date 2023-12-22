import java.util.*;

class A implements Runnable {
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		for (int N = sc.nextInt(); N > 0; N = sc.nextInt()) {
			char[] cs = sc.next().toCharArray();
			int[] a = new int[N];
			int[] b = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt() - 1;
				b[i] = sc.nextInt() - 1;
			}
			for (int i = N - 1; i >= 0; i--) {
				swap(cs, a[i], b[i]);
				int d = b[i] - a[i];
				cs[a[i]] = shift(cs[a[i]], d);
				cs[b[i]] = shift(cs[b[i]], d);
			}
			System.out.println(new String(cs));
		}
	}

	char shift(char c, int d) {
		return (char) ((c + d - 'a') % 26 + 'a');
	}

	void swap(char[] cs, int i, int j) {
		char c = cs[i];
		cs[i] = cs[j];
		cs[j] = c;
	}
}
public class Main {
	public static void main(String[] args) {
		new A().run();
	}
}