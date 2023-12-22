import java.util.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0) return;
			Map<Integer,Long> m = new HashMap<Integer,Long>();
			for(int i = 0; i < n; i++){
				int k = in.nextInt();
				long p = in.nextInt(), l = in.nextInt();
				if(m.get(k) == null) m.put(k,p*l);
				else m.put(k,m.get(k)+p*l);
			}
			boolean f = true;
			for(Map.Entry<Integer,Long> entry : m.entrySet()){
				if(entry.getValue() >= 1000000l) {
					System.out.println(entry.getKey());
					f = false;
				}
			}
			if(f) System.out.println("NA");
		}
	}

}