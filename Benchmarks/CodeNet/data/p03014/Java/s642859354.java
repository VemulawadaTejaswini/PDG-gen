import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		char[][] S = new char[H][W];
		for(int i = 0; i < H; i++) {
			String Si = sc.next();
			for(int j = 0; j < W; j++) S[i][j] = Si.charAt(j);
		}
		// initialize
		int[][] L = new int[H][W], R = new int[H][W], U = new int[H][W], D = new int[H][W];
		for(int i = 0; i < H; i++) {
			Arrays.fill(L[i], 0);
			Arrays.fill(R[i], 0);
			Arrays.fill(U[i], 0);
			Arrays.fill(D[i], 0);
		}

		// Left
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i][j] == '#') continue;
				L[i][j] = 1;
				if(j != 0) L[i][j] += L[i][j - 1];
			}
		}
		// Right
		for(int i = 0; i < H; i++) {
			for(int j = W - 1; j >= 0; j--) {
				if(S[i][j] == '#') continue;
				R[i][j] = 1;
				if(j != W - 1) R[i][j] += R[i][j + 1];
			}
		}
		// Up
		for(int i = 0; i < W; i++) {
			for(int j = 0; j < H; j++) {
				if(S[j][i] == '#') continue;
				U[j][i] = 1;
				if(j != 0) U[j][i] += U[j - 1][i];
			}
		}
		// Down
		for(int i = 0; i < W; i++) {
			for(int j = H - 1; j >= 0; j--) {
				if(S[j][i] == '#') continue;
				D[j][i] = 1;
				if(j != H - 1) D[j][i] += D[j + 1][i];
			}
		}
		int max = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i][j] == '.') max = Math.max(max, L[i][j] + R[i][j] + U[i][j] + D[i][j] - 3);
			}
		}
		System.out.println(max);

	}
}