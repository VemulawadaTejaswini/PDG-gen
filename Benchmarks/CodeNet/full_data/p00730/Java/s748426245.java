import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int n, w, d;
	int[] W = new int[102];
	int[] D = new int[102];
	int[] area = new int[102];
	final int INF = 100001;

	public void run() {
		while (true) {
			n = in.nextInt();
			d = in.nextInt();
			w = in.nextInt();
			if ((n | w | d) == 0) break;

			Arrays.fill(W, INF);
			Arrays.fill(D, INF);
			Arrays.fill(area, INF);

			W[0] = w;
			D[0] = d;
			area[0] = w * d;

			int w1, w2, d1, d2;
			for (int i = 0; i < n; i++) {
				int next = in.nextInt() - 1;
				int nw = W[next];
				int nd = D[next];
				for (int j = next; j < i; j++) {
					area[j] = area[j+1];
					D[j] = area[j+1];
					W[j] = area[j+1];
				}

				int pos = in.nextInt();
				for (; pos > (nw + nd) * 2; pos -= (nw + nd) * 2);

				if (pos < nd) {
					w1 = w2 = nw;
					d1 = pos;
					d2 = nd - pos;
				} else if (pos < nw + nd) {
					pos -= nd;
					d1 = d2 = nd;
					w1 = pos;
					w2 = nw - pos;
				} else if (pos < nw + nd * 2) {
					pos -= (nd + nw);
					w1 = w2 = nw;
					d1 = pos;
					d2 = nd - pos;
				} else {
					pos -= (nd * 2 + nw);
					d1 = d2 = nd;
					w1 = pos;
					w2 = nw - pos;
				}
				if (w1 * d1 > w2 * d2) {
					int temp = w1;
					w1 = w2;
					w2 = temp;
					temp = d1;
					d1 = d2;
					d2 = temp;
				}
				W[i] = w1; W[i + 1] = w2;
				D[i] = d1; D[i + 1] = d2;
				area[i] = w1 * d1; area[i + 1] = w2 * d2;							
			}
			Arrays.sort(area);
			for (int i = 0; i < area.length; i++) {
				if (area[i] == INF) break;
				System.out.print(area[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}