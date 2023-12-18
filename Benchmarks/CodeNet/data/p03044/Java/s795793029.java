
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//隣接リスト
		List<ArrayList<int[]>> v = new ArrayList<ArrayList<int[]>>(N);
		for(int i=0;i<N;i++) v.add(new ArrayList<int[]>());
		for(int i=0;i<N-1;i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int dist = sc.nextInt();
			from--;
			to--;//配列の要素番号と合わせる。		
			int tmp[] = {to,dist};
			v.get(from).add(tmp); 
			int tmp2[] = {from,dist};
			v.get(to).add(tmp2); 
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
			List<int[]> li = v.get(from);
			for(int tmp[]:li) {
				int to = tmp[0];
				int dist = tmp[1];
				if(ans[to]!=-1)continue;//if done, do nothing
				ans[to]=dist%2;
				q.add(to);
			}
		}
		StringBuilder sb = new StringBuilder();
		Arrays.stream(ans).forEach(i->sb.append(i+"\n"));
		System.out.println(sb.toString());
		
	}
}