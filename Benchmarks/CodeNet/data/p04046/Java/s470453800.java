import java.util.*;
public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int MOD = 1000000007;

		int[][] arr = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(i >= (h-a-1) && j <= (b-1)) {
					arr[i][j] = 0;
				}
				else if(i == 0 || j == 0) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = (arr[i-1][j] + arr[i][j-1]) % MOD;
				}
			}
		}
		System.out.println(arr[h-1][w-1]);
	}
}