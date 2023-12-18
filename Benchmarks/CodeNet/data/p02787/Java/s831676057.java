// pE
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	int inf = (int)1e9;

	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();

		int H = Integer.parseInt(line.split("\\s+")[0]);
		int N = Integer.parseInt(line.split("\\s+")[1]);

		List<Spell> spells = new ArrayList<>();
		for (int i=0; i<N; i++) {
			// spells[i] = Integer.parseInt(scanner.nextLine().split("\\s+")[0]);
			line = scanner.nextLine();
			int a = Integer.parseInt(line.split("\\s+")[0]);
			int b = Integer.parseInt(line.split("\\s+")[1]);
			spells.add(new Spell(a, b));
		}
		// System.out.println(Arrays.toString(spells));

		HashMap<String, Integer> mem = new HashMap<>();

		int res = dfs(0, spells, H, mem);
		System.out.println(res);

		return;
	}

	public int dfs(int idx, List<Spell> spells, int monsterHealth, Map<String, Integer> mem) {
		if (monsterHealth <= 0) return 0;
		if (idx == spells.size()) return inf;

		String key = String.valueOf(idx) + "_" + String.valueOf(monsterHealth);
		if (mem.containsKey(key)) return mem.get(key);

		int res = (int)1e9;
		// use
		int t = dfs(idx, spells, monsterHealth - spells.get(idx).power, mem);
		if (t != inf) res = Math.min(res, spells.get(idx).cost + t);
		// pass
		t = dfs(idx + 1, spells, monsterHealth, mem);
		if (t != inf) res = Math.min(res, t);

		mem.put(key, res);
		return res;
	}

	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}
class Spell {
	public int power, cost;
	public Spell(int power, int cost) {
		this.power = power;
		this.cost = cost;
	}
}
