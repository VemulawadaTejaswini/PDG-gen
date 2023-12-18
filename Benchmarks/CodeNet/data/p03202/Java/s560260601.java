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
    private Map<Integer,Integer> s;
    private int k = 1;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.solve();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    n = Integer.parseInt(br.readLine());
	    a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    s = new TreeMap<>();
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }

    private void solve() {
	set();
	for (int i=1;i<n;i++) {
	    if (a[i] > a[i-1]) continue;
	    int idx = -1;
	    for (Iterator<Entry<Integer,Integer>> it = s.entrySet().iterator();it.hasNext();) {
		Entry<Integer,Integer> e = it.next();
		int key = e.getKey();
		if (key > a[i]) {
		    it.remove();
		    while (it.hasNext()) {
			it.next();
			it.remove();
		    }
		    break;
		}
		int value = e.getValue();
		if (value < k-1) idx = key;
	    }
	    int v = s.getOrDefault(a[i],0) + 1;
	    if (v < k) { s.put(a[i],v); continue; }
	    if (idx < 0) { s.put(a[i],v); k++ ; continue; }
	    s.put(idx,s.get(idx)+1);
	    for (Iterator<Entry<Integer,Integer>> it = s.entrySet().iterator();it.hasNext();) {
		if (it.next().getKey() == idx) {
		    while (it.hasNext()) {
			it.next();
			it.remove();
		    }
		}
	    }
	}
	System.out.println(k);
    }
}