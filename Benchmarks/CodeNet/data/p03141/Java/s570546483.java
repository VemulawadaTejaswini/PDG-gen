import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n  = sc.nextInt();
		
		
		int[][] arr = new int[n][3];
		
		for(int i =0 ; i < n ; i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = arr[i][0]+arr[i][1];
		}
		
		Arrays.sort(arr, (ar1,ar2) -> -Integer.compare(ar1[2],ar2[2]));

		long ans[] = new long[2];
		int now = 0;
		for(int i = 0; i < n ; i++){
			ans[now] += arr[i][now];
			now = 1 - now;
		}
		
		System.out.println(ans[0]-ans[1]);
	}
}
