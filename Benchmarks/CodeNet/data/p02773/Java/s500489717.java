//--- pC ---//
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
		int n = Integer.parseInt(scanner.nextLine());
		Map<String, Integer> map = new HashMap<>();

		for (int i=0; i<n; i++) {
			String line = scanner.nextLine();
			map.putIfAbsent(line, 0);
			map.put(line, map.get(line) + 1);
		}

		List<Num> list = new ArrayList<>();
		for (String str : map.keySet()) {
			list.add(new Num(str, map.get(str)));
		}

		Collections.sort(list, new ComparatorNum());
		int max_cnt = list.get(0).cnt;

		for (Num u : list) {
			if (u.cnt != max_cnt) break;
			System.out.println(u.val);
		}

		return;
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

class Num {
	public String val;
	public int cnt;
    public Num(String val, int cnt) {
        this.val = val;
        this.cnt = cnt;
    }
}


class ComparatorNum implements Comparator<Num> {
    public int compare(Num a, Num b) {
        if (a.cnt == b.cnt) {
            return a.val.compareTo(b.val);
        } else {
            return b.cnt - a.cnt;
        }
    }
}
