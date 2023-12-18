import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int A = sc.nextInt();
		int[][] X = new int[N][2];
		for(int i = 0; i < N; i++) {
			X[i][0] = sc.nextInt();
			X[i][1] = sc.nextInt();
		}
		Arrays.sort(X, (x, y) -> x[0] - y[0]);
		long ans = 0;
		int i = 0, temp;
		while(i < N) {
			temp = X[i][0] + D;
			int k = (X[i][1] + A - 1) / A;
			ans += k;
			i++;
			int j = i;
			boolean ok = true;
			while(true) {
				if(j >= N) {
					if(ok)
						i = N;
					break;
				}
				if(X[j][0] > temp + D) {
					if(ok)
						i = j;
					break;
				}
				if(X[j][1] > A * k) {
					X[j][1] -= A * k;
					if(ok) {
						i = j;
						ok = false;
					}
				}
				j++;
			}
		}
		System.out.println(ans);
	}

}