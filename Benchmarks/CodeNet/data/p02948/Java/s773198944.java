import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int[][] A = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, (x,y) -> x[1]==y[1] ? y[0]-x[0] : y[1]-x[1]);
		long ans = 0;
		int p = 0;
		for(int i = M; i > 0; i--) {
			for(int j = p; j < N; j++) {
				if(A[j][0] <= i) {
					ans += A[j][1];
					p = j+1;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}