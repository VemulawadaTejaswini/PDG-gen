import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] red = new int[N][2];
		int[][] blue = new int[N][2];
		boolean[] used = new boolean[N];
		int ans = 0;
		for(int i = 0; i < N; i++) {
			red[i][0] = sc.nextInt();
			red[i][1] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			blue[i][0] = sc.nextInt();
			blue[i][1] = sc.nextInt();
		}
		Arrays.sort(blue, (x,y) -> x[0] - y[0]);
		Arrays.sort(red, (x,y) -> x[1] - y[1]);
		for(int i = 0; i < N; i++) {
			for(int j = N-1; j >= 0; j--) {
				if(blue[i][0] > red[j][0] && blue[i][1] > red[j][1] && !used[j]) {
					ans += 1;
					used[j] = true;
					break;
				}
			}
		}
		System.out.println(ans);

	}

}
