import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] xy = new long[n][2];
		for (int i = 0; i < n; i++) {
			xy[i][0] = sc.nextLong();
			xy[i][1] = sc.nextLong();
		}
		double max = 0;
		if(n > 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(j == i) continue;
					for (int k = 0; k < n; k++) {
						if(k == i || k == j) continue;
						max = Math.max(max, rad_cir(xy[i][0], xy[i][1], xy[j][0], xy[j][1], xy[k][0], xy[k][1]));
						System.out.println(max);
						if(max > 10) System.out.printf("%d %d %d\n",i,j,k);
					}
				}
			}
		}else {
			max = Math.sqrt((double)((xy[0][0]-xy[1][0])*(xy[0][0]-xy[1][0])+(xy[0][1]-xy[1][1])*(xy[0][1]-xy[1][1])))/2;
		}

		System.out.println(max);
		sc.close();

	}
	public static double rad_cir(long ax,long ay,long bx, long by, long cx, long cy) {
		long a2 = (bx-cx)*(bx-cx)+(by-cy)*(by-cy);
		long b2 = (ax-cx)*(ax-cx)+(ay-cy)*(ay-cy);
		long c2 = (ax-bx)*(ax-bx)+(ay-by)*(ay-by);
		double max = Math.max(a2, b2);
		max = Math.sqrt(Math.max(max, c2))/2;

		if((bx-ax)*(cy-ay)==(by-ay)*(cx-ax)) return max;

		double denom = Math.sqrt((double)(a2*b2*c2));
		double numer = Math.sqrt((double)(2*(a2*b2+b2*c2+c2*a2)-(a2*a2+b2*b2+c2*c2)));

		return Math.min(denom/numer, max);
	}

}