import java.util.Scanner;

// Java8
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		int n = sc.nextInt();
		int[][] s = new int[n+1][n+1];
		for(int y=1; y<=n; y++) {
			for(int x=1; x<=n; x++) {
				s[y][x] = sc.nextInt();
				s[y][x] += s[y-1][x] + s[y][x-1] - s[y-1][x-1];
			}
		}
		int max = s[n][n];
		for(int b=1; b<=n; b++) {
			for(int t=0; t<b; t++) {
				for(int r=1; r<=n; r++) {
					for(int l=0; l<r; l++) {
						max = Math.max(max, s[b][r] - s[b][l] + s[t][l] - s[t][r]);
					}
				}
			}
		}
		System.out.println(max);
	}
}
