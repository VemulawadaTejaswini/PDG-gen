
import java.util.*;

public class Main {

	public static int N,M;
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		
		int[] points = new int[M];
		int[] dis = new int[M-1];
		

		for (int i = 0; i < M; i++) {
			points[i] = scanner.nextInt();
		}

		Arrays.sort(points);

		int sum = 0;

		for (int i = 1; i < M; i++) {
			dis[i-1] = points[i] - points[i-1];
			sum += dis[i-1];
		}

		Arrays.sort(dis);
		
		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			if (i == M - 1) {
				break;
			}
			ans +=  dis[M - 2 - i];
		}

		System.out.println(sum-ans);

		scanner.close();
	}

}
