import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int K = sc.nextInt();
		int T = sc.nextInt();
		ArrayList<Long> a = new ArrayList<>();
		for (int i = 0; i < T; i++) {
			a.add((sc.nextLong() << 32 | i));
		}

		Collections.sort(a);
		int ans = 0;
		int pre = -1;
		for (int i = 0; i < K; i++) {
			Collections.sort(a);
			if ((int)(a.get(a.size() - 1)-0) == pre) {
				if (a.size() > 1) {
					long v = a.get(a.size() - 2);
					a.remove(a.size() - 2);
					pre = (int) v;
					int val = (int) ((v >>> 32) - 1);
					if (val != 0) {
						a.add((long) val << 32 | pre);
					}
				} else {
					ans++;
					long v = a.get(a.size() - 1);
					a.remove(a.size() - 1);
					long val = (v >>> 32) - 1;
					if (val != 0) {
						a.add(val << 32 | pre);
					}
				}
			} else {
				long v = a.get(a.size() - 1);
				a.remove(a.size() - 1);
				pre = (int) v;
				long val = (v >>> 32) - 1;
				if (val != 0) {
					a.add(val << 32 | pre);
				}
			}
		}
		pw.println(ans);
		pw.close();

	}
	
	void tr(Object...objects){System.out.println(Arrays.deepToString(objects));}
}
