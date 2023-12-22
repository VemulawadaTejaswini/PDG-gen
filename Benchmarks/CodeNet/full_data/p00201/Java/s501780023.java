import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	HashMap<String, Integer> data,memo;
	C [] table;
	
	class C{
		String after;
		ArrayList<String> material;
		public C(String after, ArrayList<String> material) {
			this.after = after;
			this.material = material;
		}
		
	}
	
	private void doit(){
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			data = new HashMap<String, Integer>();
			memo = new HashMap<String, Integer>();
			for(int i = 0; i < n; i++){
				String s = sc.next();
				int price = sc.nextInt();
				data.put(s, price);
			}
			int k = sc.nextInt();
			table = new C[k];
			for(int i = 0; i < k; i++){
				String af = sc.next();
				int t = sc.nextInt();
				ArrayList<String> list = new ArrayList<String>();
				while(t-- > 0){
					list.add(sc.next());
				}
				table[i] = new C(af, list);
			}
			String target = sc.next();
			int res = dfs(target);
			System.out.println(res);
		}
	}

	private int dfs(String target) {
		if(memo.containsKey(target)){
			return memo.get(target);
		}
		int res = data.get(target);
		for(int i = 0; i < table.length; i++){
			if(table[i].after.equals(target)){
				int nowsum = 0;
				for(int j = 0; j < table[i].material.size(); j++){
					nowsum += dfs(table[i].material.get(j));
				}
				res = Math.min(res, nowsum);
			}
		}
		memo.put(target, res);
		return res;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}