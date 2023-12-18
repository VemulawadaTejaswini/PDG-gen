import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		int[] cost = new int[N];
		cost[N - 1] = 0;
		for (int i = N - 2; i >= 0; i--) {
//			if(i == N-2)cost[i]=Math.abs(h[i+1]-h[i]);
			int temp = K + 1;
			cost[i] = Integer.MAX_VALUE;
			while (temp-- > 1) {
				if (i + temp <= N - 1) {
//					System.out.println(":::"+i+":"+temp);
					cost[i] = Math.min(cost[i], cost[i + temp] + Math.abs(h[i + temp] - h[i]));
				}
			}
		}
		pw.println(cost[0]);
		// end

		sc.close();
		pw.close();
	}
}
