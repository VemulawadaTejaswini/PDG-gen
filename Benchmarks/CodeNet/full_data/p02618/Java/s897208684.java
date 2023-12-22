import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int[] c = new int[27];
		for (int i = 1; i < 27; i++) {
			c[i] = sc.nextInt();
		}
		int[][] s = new int[d + 1][27];
		for (int i = 1; i < d + 1; i++) {
			for (int j = 1; j < 27; j++) {
				s[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int[] last = new int[27];
		int v = 0;
		for (int i = 1; i <= d; i++) {
			int maxType = 0;
			int maxV = 0;
			int[] vlist = new int[27];
			for (int j = 1; j < 27; j++) {
				int lastTmp = last[j];
				last[j] = i;
				int tmpV = v;
				tmpV += s[i][j];
				int downSatis = 0;
				for (int k = 1; k < 27; k++) {
					downSatis += (c[k] * (i - last[j]));
				}
				tmpV -= downSatis;
				vlist[j] = tmpV;
				if (j == 1) {
					maxType = j;
					maxV = tmpV;
				}
				if (maxV < tmpV) {
					maxV = tmpV;
					maxType = j;
				}
				last[j] = lastTmp;
			}
			v = vlist[maxType];
			last[maxType] = i;
			System.out.println(maxType);
		}
	}
}
