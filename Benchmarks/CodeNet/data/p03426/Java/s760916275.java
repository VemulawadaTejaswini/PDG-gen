import java.util.Scanner;

public class Main {

	Scanner sc;
	int H, W;
	int D, Q;
	int x[], y[];
	int ary[];
	
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		init();
		calcDist();
		Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			System.out.println(-ary[sc.nextInt()-1] + ary[sc.nextInt()-1]);
		}
		sc.close();
	}
	
	void calcDist() {
		int n;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				n = sc.nextInt()-1;
				x[n] = j;
				y[n] = i;
			}
		}
		
		for(int i=D; i<H*W; i++) {
			ary[i] = ary[i-D] + Math.abs(x[i] - x[i-D]) + Math.abs(y[i] - y[i-D]);
		}
	}
	
	void init() {
		sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		D = sc.nextInt();
		x = new int[H*W];
		y = new int[H*W];
		ary = new int[H*W];
		ary[0] = 0;
	}
}