import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
	static Hashtable<Integer, ArrayList<Integer>> tree = new Hashtable<>();
	static HashMap<Integer,Long> v = new HashMap<>();
	static long [] vi = null;
	static HashSet visited = new HashSet<>();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		vi = new long[n+1];
		for (int i = 0; i < vi.length; i++) {
			vi[i]=0;
		}
		for (int i = 0; i <n-1; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			if(tree.containsKey(a)) {
				ArrayList dat = tree.get(a);
				dat.add(b);
				tree.put(a, dat);
			}else {
				ArrayList dat = new ArrayList<>();
				dat.add(b);
				tree.put(a, dat);
			}
			if(tree.containsKey(b)) {
				ArrayList dat = tree.get(b);
				dat.add(a);
				tree.put(b, dat);
			}else {
				ArrayList dat = new ArrayList<>();
				dat.add(a);
				tree.put(b, dat);
			}
		}
		for (int i = 0; i < q; i++) {
			int p = s.nextInt();
			long x = s.nextLong();
			if(v.containsKey(p)) {
				v.put(p,v.get(p)+x);
			}else {
				v.put(p,x);
			}
		}		
		solveDfs(1,0L);
		String sim = "";
		for (int i = 1; i <=n; i++) {
			sim+=vi[i]+" ";
		}
		System.out.println(sim.substring(0,sim.length()-1));
	}
	public static void solveDfs(int x,long value_parent) {
		if(!visited.contains(x)) {
			visited.add(x);
			long vix = 0;
			if(v.containsKey(x)) {
				vix=v.get(x);
			}
			vi[x]=vix+value_parent;
			if(tree.containsKey(x)) {
				ArrayList<Integer> vals = tree.get(x);
				for (int i = 0; i < vals.size(); i++) {
					solveDfs(vals.get(i),vix+value_parent);
				}
			}
			
		}
	}

}
