import java.util.*;
import java.awt.geom.*;

public class Main{
	HashMap<String, Integer> map;
	SCC scc;
	int n, m;
	
	class C{
		int v1, v2, op;
		boolean v1value, v2value;
		public C(int v1, int v2, boolean v1value, boolean v2value, int op) {
			this.v1 = v1;
			this.v2 = v2;
			this.v1value = v1value;
			this.v2value = v2value;
			this.op = op;
		}
		@Override
		public String toString() {
			return "C [v1=" + v1 + ", v2=" + v2 + ", op=" + op + ", v1value="
					+ v1value + ", v2value=" + v2value + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			m = sc.nextInt();
			
			map = new HashMap<String, Integer>();
			scc = new SCC(m * 2);
			
			for(int i = 0; i < n; i++){
				String s = sc.next().split(";")[0];
				C nowexp = exp(s);
				int v1 = nowexp.v1value ? nowexp.v1 : nowexp.v1 + m;
				int v2 = nowexp.v2value ? nowexp.v2 : nowexp.v2 + m;
				if(nowexp.op == 0){
					//single
					addOr(v1,v1);
				}
				else if(nowexp.op == 1){
					//or
					addOr(v1, v2);
				}
				else{
					//and
					addOr(v1, v1);
					addOr(v2, v2);
				}
			}
			scc.scc();
			boolean ans = true;
			for(int i = 0; i < m; i++){
				if(scc.cmp[i] == scc.cmp[m + i]){
					ans = false;
					break;
				}
			}
			System.out.println(ans ? "accept" : "reject");
		}
	}
	
	private void addOr(int v1, int v2) {
		scc.addEdge((v1 + m) % (m * 2), v2);
		scc.addEdge((v2 + m) % (2 * m), v1);
	}

	private C exp(String s) {
		if(s.indexOf("&") >= 0 || s.indexOf("|") >= 0){
			//否定の数を数えて、true or falseをきめる
			//変数の名前を抽出する
			//oprand はどっちになるのか
			int opind = s.indexOf("&");
			int opcount = 0;
			boolean isAnd = true;
			if(opind >= 0){
				//and
				opcount = 1;
				opind = 2;
			}
			else{
				opind = 1;
				isAnd = false;
			}
			String [] ss = s.split("[&\\|]");
			String [] varname = new String[2];
			for(int i = 0; i < 2; i++){
				varname[i] = ss[i].replaceAll("\\W", "");
			}
			int [] vartexind = new int[2];
			for(int i = 0; i < 2; i++){
				if(map.containsKey(varname[i])){
					vartexind[i] = map.get(varname[i]);
				}
				else{
					vartexind[i] = map.size();
					map.put(varname[i], vartexind[i]);
				}
			}
			//任意に変換できる否定。全体かAだけにやるかのどちらかを選べる
			int [] vartexNotCount = new int[2];
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < ss[i].length() - 1; j++){
					if(ss[i].charAt(j) == '~' && ss[i].charAt(j + 1) != '('){
						vartexNotCount[i]++;
					}
					if(ss[i].charAt(j) == '~' && ss[i].charAt(j + 1) == '('){
						if(i == 0){
							opcount++;
						}
						else{
							vartexNotCount[1]++;
						}
					}
				}
			}
			if(opcount % 2 == 0){
				if(isAnd){
					//ANDからスタートしたので反転する
					vartexNotCount[1]++;
					vartexNotCount[0]++;
				}
			}
			else{
				//現在and
				if(vartexNotCount[0] == 0){
					//andにするしかない
					if(! isAnd){
						//orからスタートしたから反転する
						vartexNotCount[0]++;
						vartexNotCount[1]++;
					}
				}
				else{
					//orにできる
					vartexNotCount[0]--;
					opcount++;
					
					if(isAnd){
						vartexNotCount[0]++;
						vartexNotCount[1]++;
					}
				}
			}
			C res = new C(vartexind[0], vartexind[1], vartexNotCount[0] % 2 == 0, vartexNotCount[1] % 2 == 0, opcount % 2 == 0 ? 1 : 2);
			return res;
		}
		
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '~'){
				count++;
			}
		}
		String varname = s.replaceAll("\\W", "");
		int ind = -1;
		if(map.containsKey(varname)){
			ind = map.get(varname);
		}
		else{
			ind = map.size();
			map.put(varname, ind);
		}
		C single = new C(ind, -1, count % 2 == 0, true, 0);
		return single;
	}

	class SCC{
		int n;
		ArrayList<ArrayList<Integer>> g, rg;
		ArrayList<Integer> vs;
		boolean [] used;
		int [] cmp;
		
		SCC(int n){
			this.n = n;
			g = new ArrayList<ArrayList<Integer>>();
			rg = new ArrayList<ArrayList<Integer>>();
			for(int i = 0 ; i < n; i++){
				g.add(new ArrayList<Integer>());
				rg.add(new ArrayList<Integer>());
			}
			vs = new ArrayList<Integer>();
			used = new boolean[n];
			cmp = new int[n];
		}
		private void addEdge(int from, int to){
			g.get(from).add(to);
			rg.get(to).add(from);
		}
		private void dfs(int v){
			used[v] = true;
			for(int i = 0; i < g.get(v).size(); i++){
				if(! used[g.get(v).get(i)]) dfs(g.get(v).get(i));
			}
			vs.add(v);
		}
		private void rdfs(int v , int k){
			used[v] = true;
			cmp[v] = k;
			for(int i = 0; i < rg.get(v).size(); i++){
				if(! used[rg.get(v).get(i)]) rdfs(rg.get(v).get(i), k);
			}
		}
		private int scc(){
			Arrays.fill(used, false);
			for(int v = 0; v < n; v++){
				if(! used[v] ) dfs(v);
			}
			Arrays.fill(used, false);
			int k = 0 ;
			for(int i = vs.size() - 1; i >= 0; i--){
				if(!used[vs.get(i)]) rdfs(vs.get(i), k++);
			}
			return k;
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}