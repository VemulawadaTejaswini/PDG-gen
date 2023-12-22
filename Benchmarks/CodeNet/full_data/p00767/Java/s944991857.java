import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	class V {
		int w;
		int h;
	}

	void run() {

		List<V> list = new LinkedList<V>();
		for (int i = 1; i < 151; i++) {
			for (int j = i + 1; j < 151; j++) {
				V v = new V();
				v.h = i;
				v.w = j;
				list.add(v);
			}
		}

		V[] v = list.toArray(new V[0]);
		Arrays.sort(v, Main::compare);
		for (;;) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (w == 0 && h == 0) {
				break;
			}

			V vv = new V();
			vv.h = h;
			vv.w = w;

			int ind = Arrays.binarySearch(v, vv, Main::compare);
			System.out.println(v[ind + 1].h + " " + v[ind + 1].w);
		}

	}

	static int compare(V v1, V v2) {
		return v1.w * v1.w + v1.h * v1.h != v2.w * v2.w + v2.h * v2.h
				? v1.w * v1.w + v1.h * v1.h - v2.w * v2.w - v2.h * v2.h : 
					v1.h - v2.h;
	}

}

