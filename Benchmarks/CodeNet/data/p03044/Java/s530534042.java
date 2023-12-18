
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//隣接リスト
		int v[][] = new int[N][N];
		//List配列
		List<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++) l.add(new ArrayList<Integer>());
		for(int i=0;i<N-1;i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int dist = sc.nextInt();
			from--;
			to--;//配列の要素番号と合わせる。		
			v[from][to]=dist;
			l.get(from).add(to);
			l.get(to).add(from);
		}
		sc.close();
		
		int ans[] = new int[N];
		Arrays.fill(ans,-1);
		ans[0]=0;
		
		//BFSするためのキュー
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(0);//initialized
		while(!q.isEmpty()) {
			int from = q.poll();
			List<Integer> li = l.get(from);
			for(int to:li) {
				if(ans[to]!=-1)continue;//if done, do nothing
				ans[to]=v[from][to]%2;
				q.add(to);
			}
		}
		StringBuilder sb = new StringBuilder();
		Arrays.stream(ans).forEach(i->sb.append(i+"\n"));
		System.out.println(sb.toString());
		
	}
}