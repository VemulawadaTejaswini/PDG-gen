
import static java.util.Arrays.deepToString;
import static java.util.Arrays.fill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			T[] ts = new T[n];
			for (int i = 0; i < n; i++) {
				T t = new T();
				t.id = sc.nextInt();
				for (int j = 0; j < 4; j++) {
					int m = sc.nextInt();
					int s = sc.nextInt();
					t.time += m * 60 + s;
				}
				ts[i] = t;
			}
			Arrays.sort(ts);
			System.out.println(ts[0].id);
			System.out.println(ts[1].id);
			System.out.println(ts[n-2].id);
			
		}
	}
	public class T implements Comparable<T> {
		int id;
		int time;
		@Override
		public int compareTo(T o) {
			if (time != o.time) return time - o.time;
			return id - o.id;
		}
	}
}