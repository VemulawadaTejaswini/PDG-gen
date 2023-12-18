import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		char S[][] = new char[H][W];
		for(int i=0; i<H; i++) {
			S[i] = sc.next().toCharArray();
		}

		int L[][] = new int[H][W];
		int R[][] = new int[H][W];
		int U[][] = new int[H][W];
		int D[][] = new int[H][W];

		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				char c = S[i][j];
				if(c=='#') {
					L[i][j]=0;
					U[i][j]=0;
				}else {
					if(j-1>=0) {
						L[i][j] = L[i][j-1]+1;
					}else {
						L[i][j] = 1;
					}

					if(i-1>=0) {
						U[i][j] = U[i-1][j]+1;
					}else {
						U[i][j] = 1;
					}
				}
			}
		}
		for(int i=H-1; i>=0; i--) {
			for(int j=W-1; j>=0; j--) {
				char c = S[i][j];
				if(c=='#') {
					R[i][j]=0;
					D[i][j]=0;
				}else {
					if(j+1<W) {
						R[i][j] = R[i][j+1]+1;
					}else {
						R[i][j] = 1;
					}
					if(i+1<H) {
						D[i][j] = D[i+1][j]+1;
					}else {
						D[i][j] = 1;
					}
				}
			}
		}
		int ans = 0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				ans = Math.max(ans, L[i][j]+R[i][j]+U[i][j]+D[i][j]-3);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
