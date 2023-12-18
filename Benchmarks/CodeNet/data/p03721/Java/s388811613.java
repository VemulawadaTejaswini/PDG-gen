import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int ans = 0;
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
		for (int i = 0; i < N; i++) {
			ans = arr[i][0];
			K-=arr[i][1];
			if (K<=0) break;
		}
		System.out.println(ans);
	}
}