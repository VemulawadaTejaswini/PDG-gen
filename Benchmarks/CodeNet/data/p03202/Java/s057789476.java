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
	int ng = 0;
	int ok = n;
	while (ok != ng+1) {
	    int k = (ng+ok)/2;
	    if (isPossible(k)) {
		ok = k;
	    } else {
		ng = k;
	    }
	}
	System.out.println(ok);
    }

    private boolean isPossible(int k) {
	Map<Integer,Integer> s = new TreeMap<>();
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
		if (key < a[i]) {
		    int value = e.getValue();
		    if (value < k-1) idx = key;
		}
	    }
	    int v = s.getOrDefault(a[i],0) + 1;
	    if (v < k) {
		s.put(a[i],v);
		continue;
	    } else {
		if (idx < 0) return false;
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
	}
	return true;
    }
}