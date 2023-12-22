import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		Map<Integer,Long> h = new LinkedHashMap<Integer,Long>();
		List<Boolean> maxVertex = new ArrayList<Boolean>();
		for(int i = 0; i < n; i++) {
			h.put(i, sc.nextLong());
			maxVertex.add(true);
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			if(h.get(a) < h.get(b)) {
				maxVertex.set(a,false);
			}
			else if(h.get(a)>h.get(b)) {
				maxVertex.set(b,false);
			}
			else {
				maxVertex.set(a,false);
				maxVertex.set(b,false);
			}
		}
		for(boolean i:maxVertex) {
			if(i == true) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}