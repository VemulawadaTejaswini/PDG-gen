import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), m = in.nextInt();

		int[] len = new int[N], pCnt = new int[N];
		ArrayList<Integer>[] chldList = new ArrayList[N];
		for ( int i = 0; i < N; i++ ) {
			chldList[i] = new ArrayList<Integer>();
		}

		for ( int i = 0; i < m; i++ ) {
			int x = in.nextInt() - 1, y = in.nextInt() - 1;
			chldList[x].add(y);
			pCnt[y]++;
		}
		in.close();

		// 始点サーチ
		ArrayDeque<Integer> toCheck = new ArrayDeque<>();
		for ( int i = 0; i < N; i++ ) {
			if ( pCnt[i] == 0 ) toCheck.add(i);
		}

		// BFSで距離計算開始
		int lenMax = 0;
		while ( toCheck.size() > 0 ) {
			Integer node = toCheck.pollFirst();
			for ( Integer chld : chldList[node] ) {
				pCnt[chld]--;
				len[chld] = Math.max(len[node] + 1, len[chld]);
				lenMax = Math.max(lenMax, len[chld]);
				if ( pCnt[chld] == 0 ) {
					toCheck.add(chld);
				}
			}
		}
		System.out.println(lenMax);
	}
}