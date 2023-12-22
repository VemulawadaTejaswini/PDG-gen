import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long [] n = new long[t];
		int [] a = new int[t];
		int [] b = new int[t];
		int [] c = new int[t];
		int [] d = new int[t];

		for (int i=0; i<t; i++) {
			n[i] = sc.nextLong();
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		sc.close();

		for (int i=0; i<t; i++) {
			long ans = 0;
			int cost = 0;
			long ni = n[i];
			int ai = a[i];
			int bi = b[i];
			int ci = c[i];
			int di = d[i];
			// はじめに+１する。
			ans = 1;
			cost +=di;

			// すべて+１が最小の場合はすべて+１で決定。
			if ((di*ni < Math.floor(ni/5)*ci+(ni%5)*di)
				&&
				(di*ni < Math.floor(ni/6)*(ai+bi)+(ni%6)*(ai+bi))) {
				System.out.println(di*ni);
				continue;
			}
			int method = 0;
			int ccost =0;
			if (ai+bi<ci) {
				// method1 : 2*3で回す
				method = 6;
				ccost = ai+bi;
			} else {
				// method2 : ５で回す
				method = 5;
				ccost = ci;
			}
			while(true) {
				if (ans == ni) {
					System.out.println(cost);
					break;
				} else if (ans < ni && ans*method <= ni+1) {
					ans *= method;
					cost += ccost;
				} else if (ans < ni && ans*3 <= ni+1) {
					ans *= 3;
					cost += bi;
				} else if (ans < ni && ans*2 <= ni+1) {
					ans *= 2;
					cost += ai;
				} else if (ans < ni) {
					ans +=1;
					cost += di;
				} else {
					ans -=1;
					cost += di;
				}

			}
		}

	}
}
