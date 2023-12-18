import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ins = br.readLine().split(" ");
		int N = Integer.parseInt(ins[0]), m = Integer.parseInt(ins[1]);

		int[] len = new int[N], pCnt = new int[N];
		ArrayList<Integer>[] chldList = new ArrayList[N];
		for ( int i = 0; i < N; i++ ) {
			chldList[i] = new ArrayList<Integer>();
		}

		for ( int i = 0; i < m; i++ ) {
			ins = br.readLine().split(" ");
			int x = Integer.parseInt(ins[0]) - 1, y = Integer.parseInt(ins[1]) - 1;
			chldList[x].add(y);
			pCnt[y]++;
		}

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

