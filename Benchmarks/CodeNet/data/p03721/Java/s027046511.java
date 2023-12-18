import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
		int curIndex=0;
		int ans = -1;
		while (K>0) {
			ans=arr[curIndex][0];
			K-=arr[curIndex][1];
			curIndex++;
		}
		System.out.println(ans);
	}
}
