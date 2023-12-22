import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static final int UPPER = 1260;
	public static final int UNDER = 540;
	public static final int MAX = UPPER - UNDER;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			if(N == 0 && M == 0){
				break;
			}
			
			final int r = sc.nextInt();

			int[][] students = new int[M][MAX];

			for (int i = 0; i < r; i++) {
				final int t = sc.nextInt() - UNDER;
				final int n = sc.nextInt();
				final int m = sc.nextInt() - 1;
				final int s = sc.nextInt();

				if (s == 1) {
					students[m][t]++;
				} else if (t < MAX) {
					students[m][t]--;
				}
			}
			
			for(int i = 0; i < M; i++){
				for(int t = 1; t < MAX; t++){
					students[i][t] += students[i][t-1];
				}
			}
			
			final int q = sc.nextInt();

			for (int i = 0; i < q; i++) {
				final int ts = sc.nextInt() - UNDER;
				final int te = sc.nextInt() - UNDER;
				final int m = sc.nextInt() - 1;
				
				int count = 0;
				for(int t = ts; t < te; t++){
					count += students[m][t] == 0 ? 0 : 1;
				}
				
				System.out.println(count);
				
			}
		}
	}
}