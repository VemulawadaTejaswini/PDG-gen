import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[][] A = new int[N][M], B = new int[M][N];
		Buff[] check = new Buff[N];
		for (int i = 0; i < N; i++) {
			check[i] = new Buff(M);
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			ArrayList<Integer> buf = new ArrayList<Integer>();
			Queue<Integer> Q = new ArrayDeque<Integer>();
			for(int j = 0;j < M;j++) {
				Q.add(j);
			}
			boolean sec = false;
			while(!Q.isEmpty()) {
				int j = Q.poll();
				int a = A[i][j];
				// int col = (a-1)%M;
				if((a-1)/M == i && !sec) {
					Q.add(j);
					if(j==M-1)sec = true;
					continue;
				}
				int rc = check[(a - 1) / M].getM(buf);
				buf.add(rc);
				B[rc][i] = A[i][j];
				if(j==M-1)sec = true;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(((j == 0) ? "" : " ") + B[j][i]);
			}
			System.out.println();
		}

		for (int i = 0; i < M; i++) {
			Arrays.sort(B[i]);
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(((j == 0) ? "" : " ") + B[j][i]);
			}
			System.out.println();
		}

	}

}

class Buff {
	ArrayList<Integer> checkList;

	public Buff(int M) {
		checkList = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			checkList.add(i);
		}
	}

	int getM(ArrayList<Integer> buf) {
		int col;
		for (int i = 0; i < checkList.size(); i++) {
			col = checkList.get(i);
			if(!buf.contains(col)) {
				checkList.remove(i);
				return col;
			}
		}
		return-1;
	}
}
