import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();

		int[] c = new int[N];
		int[] t = new int[N];

		for(int i=0; i<N; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}

		int cmin = c[0];
		int imin = 0;

		for(int j=0; j<N; j++) {
			if(c[j] < cmin && t[j] <= T) {
				cmin = c[j];
				imin = j;
			}
		}

		if(t[imin] > T) {
			System.out.println("TLE");
		}else {
			System.out.println(cmin);
		}

	}

}
