
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int N, a, d, M, K;
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		List<Integer> ID = new ArrayList<Integer>();
		List<Integer> val = new ArrayList<Integer>();

		N = sc.nextInt();
		a = sc.nextInt();
		d = sc.nextInt();
		M = sc.nextInt();
		for (int i = 0; i < M; ++i) {
			x = sc.nextInt();
			y = sc.nextInt() - 1;
			z = sc.nextInt() - 1;
			int tmpy;
			int tmpz;
			if (x == 0) {
				if (ID.contains(y)) {
					tmpy = val.get(ID.indexOf(y));
					val.remove(ID.indexOf(y));
					ID.remove(ID.indexOf(y));
				} else {
					tmpy = a + y * d;
				}
				if (ID.contains(z)) {
					tmpz = val.get(ID.indexOf(z));
					val.remove(ID.indexOf(z));
					ID.remove(ID.indexOf(z));
				} else {
					tmpz = a + z * d;
				}
				ID.add(z);
				val.add(tmpy);
				ID.add(y);
				val.add(tmpz);
			} else if (x == 1) {
				if (ID.contains(z)) {
					tmpz = val.get(ID.indexOf(z));
				} else {
					tmpz = a + z * d;
				}

				if (ID.contains(y)) {
					tmpy = val.get(ID.indexOf(y));
					val.remove(ID.indexOf(y));
					ID.remove(ID.indexOf(y));
				}
				ID.add(y);
				val.add(tmpz);
			}
		}
		K = sc.nextInt() - 1;
		sc.close();
		int tmp;
		if (ID.contains(K)) {
			tmp = val.get(ID.indexOf(K));
		} else {
			tmp = a + K * d;
		}
		System.out.println(tmp);
	}
}

