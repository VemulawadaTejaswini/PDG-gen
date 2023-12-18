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

		// ノード配列作成
		Node[] nodes = new Node[N];
		for ( int i = 0; i < N; i++ ) {
			nodes[i] = new Node();
		}
		for ( int i = 0; i < m; i++ ) {
			ins = br.readLine().split(" ");
			int x = Integer.parseInt(ins[0]) - 1, y = Integer.parseInt(ins[1]) - 1;
			nodes[x].chldList.add(nodes[y]);
			nodes[y].prntCnt++;
		}

		// 始点サーチ
		ArrayDeque<Node> toCheck = new ArrayDeque<>();
		for ( Node node : nodes ) {
			if ( node.prntCnt == 0 ) toCheck.add(node);
		}

		// BFSで距離計算開始
		int lenMax = 0;
		while ( toCheck.size() > 0 ) {
			Node node = toCheck.pollFirst();
			for ( Node chld : node.chldList ) {
				chld.prntCnt--;
				chld.len = Math.max(node.len + 1, chld.len);
				// lenMax = Math.max(lenMax, chld.len);
				// 全辺をチェックした子はチェックリストへ
				if ( chld.prntCnt == 0 ) {
					toCheck.add(chld);
				}
			}
		}
		
		for(Node node : nodes) {
			lenMax = Math.max(lenMax, node.len);
		}
		System.out.println(lenMax);
	}
}

class Node{
	int				len			= 0;
	int				prntCnt		= 0;
	ArrayList<Node>	chldList	= new ArrayList<>();
}
