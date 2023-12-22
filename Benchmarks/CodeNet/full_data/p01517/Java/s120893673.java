import java.util.*;
import java.awt.geom.*;

public class Main{
	ArrayList<Integer> group;
	int [] notused;
	int resDfs, myind;
	ArrayList<ArrayList<Integer>> otherListInd;
	boolean [] used;
	C[] data;
	
	class C implements Comparable<C>{
		String name;
		int value;
		ArrayList<String> list;
		public C(String name, int value, ArrayList<String> list) {
			this.name = name;
			this.value = value;
			this.list = list;
		}
		@Override
		public int compareTo(C o) {
			return o.list.size() - this.list.size();
		}
		@Override
		public String toString() {
			return "C [name=" + name + ", value=" + value + ", list=" + list
					+ "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			HashMap<String, Integer> toindex = new HashMap<String, Integer>();
			data = new C[n];
			String myname = null;
			for(int i = 0; i < n; i++){
				ArrayList<String> list = new ArrayList<String>();
				String name = sc.next();
				if(i == 0) myname = name;
				int power = sc.nextInt();
				int m = sc.nextInt();
				while(m-- > 0){
					String other = sc.next();
					list.add(other);
				}
				data[i] = new C(name, power, list);
			}
			Arrays.sort(data);
			for(int i = 0; i < n; i++){
				toindex.put(data[i].name, i);
			}
			myind = toindex.get(myname);
			
			otherListInd = new ArrayList<ArrayList<Integer>>();
			UnionFind uf = new UnionFind(n);
			for(int i = 0; i < n; i++){
				otherListInd.add(new ArrayList<Integer>());
				for(int j = 0; j < data[i].list.size(); j++){
					String temp = data[i].list.get(j);
					int ind = toindex.get(temp);
					otherListInd.get(i).add(ind);
					uf.unite(i, ind);
				}
			}
			
			int sum = 0;
			boolean [] searched = new boolean[n];
			for(int i = 0; i < n; i++){
				int root = uf.find(i);
				if(searched[root]) continue;
				searched[root] = true;
				group = new ArrayList<Integer>();
				for(int j = 0; j < n; j++){
					if(root == uf.find(j)){
						group.add(j);
					}
				}
				resDfs = 0;
				notused = new int[n];
				used = new boolean[n];
				dfs(0, 0);
				sum += resDfs;
			}
			System.out.println(sum);
		}
	}
	
	private void dfs(int deep, int sum) {
		if(deep == group.size()){
			resDfs = Math.max(sum, resDfs);
			return ;
		}
		
		int nowind = group.get(deep);
		boolean flg = true;
		used[nowind] = true;
		
		if(notused[nowind] == 0){
			boolean AllT = true;
			for(int i = 0; i < otherListInd.get(nowind).size(); i++){
				int otherind = otherListInd.get(nowind).get(i);
				if(! used[otherind]){
					AllT = false;
					break;
				}
			}
			if(AllT) flg = false;
			
			for(int i = 0; i < otherListInd.get(nowind).size(); i++){
				int otherind = otherListInd.get(nowind).get(i);
				notused[otherind]++;
			}
			dfs(deep + 1, sum + data[nowind].value);
			for(int i = 0; i < otherListInd.get(nowind).size(); i++){
				int otherind = otherListInd.get(nowind).get(i);
				notused[otherind]--;
			}
		}
		
		if(nowind != myind && flg){
			dfs(deep + 1, sum);
		}
		used[nowind] = false;
	}

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

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}