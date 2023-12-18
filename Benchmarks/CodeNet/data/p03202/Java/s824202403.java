import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

    private long n;
    private long[] a;
    private Map<Long,Long> s;
    private long k = 1L;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.solve();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    n = Long.parseLong(br.readLine());
	    a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
	    s = new TreeMap<>();
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }

    private void solve() {
	set();
	for (long i=1;i<n;i++) {
	    if (a[i] > a[i-1]) continue;
	    long idx = -1L;
	    for (Iterator<Entry<Long,Long>> it = s.entrySet().iterator();it.hasNext();) {
		Entry<Long,Long> e = it.next();
		long key = e.getKey();
		if (key > a[i]) {
		    it.remove();
		    while (it.hasNext()) {
			it.next();
			it.remove();
		    }
		    break;
		}
		long value = e.getValue();
		if (value < k-1L) idx = key;
	    }
	    long v = s.getOrDefault(a[i],0L) + 1L;
	    if (v < k) { s.put(a[i],v); continue; }
	    if (idx < 0) { s.put(a[i],v); k++ ; continue; }
	    s.put(idx,s.get(idx)+1);
	    for (Iterator<Entry<Long,Long>> it = s.entrySet().iterator();it.hasNext();) {
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