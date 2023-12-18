import java.util.*;


public class Main {
	
	class UnionFind{
		int [] par, rank;
		int num;
		public UnionFind(int n) {
			par = new int[n];
			rank = new int[n];
			for(int i = 0 ; i < n; i++){
				par[i] = i;
				//rank[i] = 0;
			}
			num = n;
		}
		int find(int x){
			if(par[x] == x)return x;
			else return par[x] = find(par[x]);
		}
		void unite(int x, int y){
			x = find(x);
			y = find(y);
			if(x == y) return ;
			if(rank[x] < rank[y]) par[x] = y;
			else{
				par[y] = x;
				if(rank[x] == rank[y]) rank[x]++;
			}
			num--;
		}
		boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			
			UnionFind uf = new UnionFind(n+1);
			for(int i = 0; i <m; i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				uf.unite(a, b);
			}
			
			
			HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
			for(int i = 1; i <= n; i++){
				int res = uf.find(i);
				if(map.containsKey(res)){
					map.get(res).add(i);
				}
				else{
					map.put(res, new HashSet<>());
					map.get(res).add(i);
				}
			}
//			for(Integer key: map.keySet()){
//				debug(key, map.get(key));
//			}
			
			int sum = 0;
			for(int i = 0; i < n; i++){
				if(map.get(uf.find(i+1)).contains(data[i])){
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
