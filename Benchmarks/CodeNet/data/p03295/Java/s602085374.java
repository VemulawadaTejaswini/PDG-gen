import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[M][2];
		for(int i = 0; i < M; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, (x,y) -> x[1]-y[1]);
		int ans = 1, temp = A[0][1];
		for(int i = 0; i < M; i++) {
			if(A[i][0] >= temp) {
				ans++;
				temp = A[i][1];
			}
		}
		System.out.println(ans);
	}

}