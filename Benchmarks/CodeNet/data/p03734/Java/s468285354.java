import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

	static long first = -1;
	static int w = -1;

	// 14:33-
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int n = sc.nextInt();
		w = sc.nextInt();

		ArrayList[] ws = new ArrayList[4];
		for (int i = 0; i < ws.length; i++) ws[i] = new ArrayList();

		for (int i = 0; i < n; i++) {
			int wi = sc.nextInt();
			if (i == 0) first = wi;
			int vi = sc.nextInt();

			ws[wi - first].add(vi);
		}

		for (int i = 0; i < ws.length; i++) Collections.sort(ws[i]);

		ArrayList[] prf = new ArrayList[4];
		for (int i = 0; i < prf.length; i++) {
			prf[i] = new ArrayList();
			prf[i].add(0L);
		}

		for (int i = 0; i < ws.length; i++) {
			int k = 1;
			int lastElem = ws[i].size() - 1;
			for (int j = lastElem; j >= 0; j--) {
				long val = (Integer) ws[i].get(j);
				val += (long) prf[i].get(k-1);
				prf[i].add(val);
				k++;
			}
		}


		AtomicLong max = new AtomicLong();
		int[] choice = new int[4];
		doit(choice, ws, prf, 0, max);

		System.out.println(max.get());
	}

	private static void doit(int[] choice, ArrayList[] ws, ArrayList[] prf, int pos, AtomicLong max) {
		if (pos == ws.length) {
			long avail = w;
			long worth = 0;
			for (int i = 0; i < choice.length; i++) {
				avail -= choice[i] * (first + i);
				if (avail < 0) break;
//				for (int j = 0; j < choice[i]; j++) worth += (Integer) ws[i].get(ws[i].size() - 1 - j);
				worth += (long) prf[i].get(choice[i]);
			}
			if (avail >= 0) max.set(Math.max(worth, max.get()));
			return;
		}

		for (int i = 0; i <= ws[pos].size(); i++) {
			choice[pos] = i;
			doit(choice, ws, prf, pos + 1, max);
		}
	}
}
