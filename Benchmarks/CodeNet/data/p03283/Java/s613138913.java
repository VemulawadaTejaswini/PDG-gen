import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		
		int[][] LR = new int[M][2];
		int[][] q = new int[Q][2];
		
		for(int i = 0;i < M;++i) {
			LR[i][0] = sc.nextInt();
			LR[i][1] = sc.nextInt();
		}
		for(int i = 0;i < Q;++i) {
			q[i][0] = sc.nextInt();
			q[i][1] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0;i < Q;++i) {
			int count = 0;
			for(int j = 0;j < M;++j)
				if(q[i][0] <= LR[j][0] && LR[j][1] <= q[i][1])count++;
			System.out.println(count);
		}		
	}
}