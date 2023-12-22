import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();
			int M = scn.nextInt();
			int X = scn.nextInt();

			int[][] algorism = new int[12][12];
			int[] bitflg = new int[12];
			List<Integer> list = new ArrayList<Integer>();

			//initialize
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M+1; j++) {
					algorism[i][j] = scn.nextInt();
				}
			}

			int result = 9999999;
			int cost = 0;
			int roop = (int) Math.pow(2, N);
			for(int i = 0; i < roop; i++) {
				int[] realize = new int[M];
				for(int j = 0; j < N; j++) {
					if(bitflg[j] == 1) {
						cost += algorism[j][0];
						for(int k = 0; k < M; k++) {
							realize[k] += algorism[j][k+1];
						}
					}
				}
				boolean flg = true;
				for(int k = 0; k < M; k++) {
					if(realize[k] < X) flg = false;
				}
				if(flg) {
					result = (int) Math.min(cost, result);
				}
				cost = 0;
				bitCalc(bitflg, 0, N);
			}
			if(result == 9999999) {
				System.out.println(-1);
			} else {
				System.out.println(result);
			}
		}
	}

	public static void bitCalc(int[] bitflg, int idx, int idxMax) {
		if(idx == idxMax) return;
		if(bitflg[idx] == 0) {
			bitflg[idx] = 1;
		} else {
			bitflg[idx] = 0;
			bitCalc(bitflg, idx+1, idxMax);
		}
	}
}