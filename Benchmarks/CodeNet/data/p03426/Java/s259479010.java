import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();

		int[] x = new int[H*W+1];
		int[] y = new int[H*W+1];

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				int a = sc.nextInt();
				x[a] = i+1;
				y[a] = j+1;
			}
		}

		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int sum = 0;
			while(true) {
				if(l >= r) break;
				sum += Math.abs(x[l] - x[l+D]) + Math.abs(y[l] - y[l+D]);
				l += D;
			}
			System.out.println(sum);
		}
	}
}
