import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] h = new int[N];

		for (int i=0;i<N;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int cx=0;
		int cy=0;
		int H=0;
		for (int xi = 0; xi<=100;xi++) {
			for (int yi = 0; yi<=100;yi++) {
				int hh = h[0];
				hh += (xi>x[0] ? xi-x[0] : x[0]-xi) + (yi>y[0] ? yi-y[0] : y[0]-yi);
				//System.out.println("xi=" + xi + "yi=" + yi + "hh=" + hh);
				for (int n=1;n<N;n++) {
					if (hh!=(h[n]+(xi>x[n] ? xi-x[n] : x[n]-xi) + (yi>y[n] ? yi-y[n] : y[n]-yi))) {
						hh = -1;
						break;
					}
				}
				if ((hh != -1)&&(H<=hh)) {
					cx = xi;
					cy = yi;
					H = hh;
				}
			}
		}

		System.out.println(cx + " " + cy + " " + H);

	}
}