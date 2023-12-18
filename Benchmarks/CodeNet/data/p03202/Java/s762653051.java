import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

    private int n;
    private int[] a;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.solve();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    n = Integer.parseInt(br.readLine());
	    a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }

    private void solve() {
	set();
	int lower = 1;
	int upper = n;
	while (lower < upper) {
	    int k = (lower+upper)/2;
	    if (isPossible(k)) {
		upper = k;
	    } else {
		lower = k+1;
	    }
	}
	System.out.println(lower+1);
    }

    private boolean isPossible(int k) {
	Map<Integer,Integer> s = new TreeMap<>();
	for (int i=1;i<n;i++) {
	    if (a[i] > a[i-1]) continue;
	    int idx = -1;
	    for (int j=1;j<=a[i];j++) {
		if (!s.containsKey(j) || (s.containsKey(j) && s.get(j) < k-1)) idx = j;
	    }
	    if (idx < 0) return false;
	    int v = s.getOrDefault(idx,0) + 1;
	    s.put(idx,v);
	    for (Iterator<Entry<Integer,Integer>> it = s.entrySet().iterator();it.hasNext();) {
		if (it.next().getKey() == idx) {
		    while (it.hasNext()) {
			it.next();
			it.remove();
		    }
		}
	    }
	}
	return true;
    }
}