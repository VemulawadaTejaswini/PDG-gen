import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
	while (ok-ng > 1) {
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
	List<Integer> s = new LinkedList<>();
	for (int i=1;i<n;i++) {
	    if (a[i] > a[i-1]) continue;
      	if (k < 2) return false;
	    s = s.stream().limit(a[i]).collect(Collectors.toList());
	    int len = s.size();
	    for (int j=0;j<a[i]-len;j++) s.add(0);
	    int m = 1 + s.get(a[i]-1);
	    if (m == k) {
		for (int j=a[i]-1;j>=0;j--) {
		    if (s.get(j) == k-1) {
			s.remove(j);
		    } else {
			int t = 1 + s.get(j);
			s.set(j,t);
			break;
		    }
		}
	    }
	    if (s.isEmpty()) return false;
	}
	return true;
    }
}