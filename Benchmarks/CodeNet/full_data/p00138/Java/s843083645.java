import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

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
			P ps[][] = new P[3][8];
			for (int k = 0; k < 3; k++)
			for (int i = 0; i < 8; i++) 
			{
				P p = new P();
				p.id = sc.nextInt();
				p.score = sc.nextDouble();
				ps[k][i] = p;
			}

			P[] rs = new P[6 * 3];
			int rss = 0;
			for (int k = 0; k < 3; k++) {
				Arrays.sort(ps[k]);
				for (int i = 0; i < 2; i++) {
					System.out.printf("%d %.2f\n", ps[k][i].id, ps[k][i].score);
				}
				for (int i = 2; i < 8; i++) {
					rs[rss++] = ps[k][i];
				}
			}
			Arrays.sort(rs);
			for (int i = 0; i < 2; i++) {
				System.out.printf("%d %.2f\n", rs[i].id, rs[i].score);
			}
		}
	}
	
	class P implements Comparable<P> {
		int id;
		double score;
		@Override
		public int compareTo(P o) {
			return Double.compare(score, o.score);
		}
	}
}