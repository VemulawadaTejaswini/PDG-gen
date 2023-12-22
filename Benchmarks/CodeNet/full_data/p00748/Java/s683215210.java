
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kumar1
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		InputStream in = System.in;
		Scanner scanner = new Scanner(in);
		LinkedList<String> ans = new LinkedList<String>();
		while (true) {
			int x = scanner.nextInt();
			if (x == 0)
				break;
			// x以下の正四面体数をすべて求める
			LinkedList<Integer> tetras = new LinkedList<Integer>();
			for (int n = 1;; n++) {
				int nt = n * (n + 1) * (n + 2) / 6;
				if (nt > x)
					break;
				tetras.add(nt);
			}
			// x以下の奇数な正四面体数をすべて求める
			LinkedList<Integer> oddtetras = new LinkedList<Integer>();
			for (int tetra : tetras) {
				if(tetra % 2 == 1)
					oddtetras.add(tetra);
			}
			// BFSでとく
			int ansa = bfs(tetras, x);
			int ansb = bfs(oddtetras, x);
			ans.add(ansa + " " + ansb);
		}
		scanner.close();
		for(String a : ans) {
			System.out.println(a);
		}
	}

	/**
	 * @param tetras
	 * @return
	 */
	private static int bfs(LinkedList<Integer> tetras, int o) {
		// TODO 自動生成されたメソッド・スタブ
		Map<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
		for(int tetra : tetras) {
			map.put(tetra, 1);
			if(tetra == o)
				return 1;
		}
		while(true) {
			for(Entry<Integer, Integer> e : map.entrySet()) {
				//System.out.println(e.getKey());
				for(int tetra : tetras) {
					int sum = e.getKey() + tetra;
					if(map.containsKey(sum) && sum <= map.get(sum))
						continue;
					if(sum == o)
						return e.getValue() + 1;
					map.put(sum, e.getValue() + 1);
				}
			}
		}
		//return 0;
	}

}