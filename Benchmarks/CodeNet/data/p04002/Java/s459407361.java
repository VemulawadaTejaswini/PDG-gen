import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int[][] f = new int[H+2][W+2];
		for (int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			f[a-1][b-1]++;
			f[a  ][b-1]++;
			f[a+1][b-1]++;
			f[a-1][b  ]++;
			f[a  ][b  ]++;
			f[a+1][b  ]++;
			f[a-1][b+1]++;
			f[a  ][b+1]++;
			f[a+1][b+1]++;
		}
		//
		int[] cnt = new int[10];
		for (int i=2; i<H; i++) {
			for (int j=2; j<W; j++) {
				cnt[f[i][j]]++;
			}
		}
		for (int i=0; i<10; i++) {
			System.out.println(cnt[i]);
		}
		//
		sc.close();
	}
	
}
