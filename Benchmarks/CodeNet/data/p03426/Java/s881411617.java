import java.util.Scanner;

public class Main {

	Scanner sc;
	int H, W;
	long D, Q;
	long matrix[][];
	
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		init();
		
		for(long i=0L; i<Q; i++) {
			long l = sc.nextLong();
			long r = sc.nextLong();
			compute(l, r);
		}
	}

	void compute(long l, long r) {
		long cost = 0;
		int xl = -1, yl = -1, x = -1, y = -1;
		while(l != r) {
			for(int i=0; i<W; i++) {
				for(int j=0; j<H; j++) {
					if(matrix[i][j] == l) {
						xl = j;
						yl = i;
					}
					if(matrix[i][j] == l+D) {
						x = j;
						y = i;
					}
					if(xl != -1 && x != -1) {
						cost += Math.abs(xl - x) + Math.abs(yl - y);
						l += D;
						break;
					}
				}
				if(xl != -1 && x != -1) {
					xl = -1; x = -1; yl = -1; y = -1;
					break;
				}
			}
		}
		System.out.println(cost);
	}
	
	void init() {
		sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		D = sc.nextLong();
		matrix = new long[H][W];
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				matrix[i][j] = sc.nextLong();
			}
		}
		Q = sc.nextLong();
	}
}