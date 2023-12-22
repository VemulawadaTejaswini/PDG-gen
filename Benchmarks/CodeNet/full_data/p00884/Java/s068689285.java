import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	Map<String, Set<String>> map = new HashMap<String, Set<String>>();
	List<String> remove = new ArrayList<String>();
	List<String> add = new ArrayList<String>();
	Set<String> checked = new HashSet<String>();
	
	void calc(String s) {
		checked.add(s);
		Set<String> set = map.get(s);
		add.clear();
		remove.clear();
		for (String t : set) {
			if (map.containsKey(t)) {
				if (!checked.contains(t))
					calc(t);
				remove.add(t);
				for (String u : map.get(t))
					add.add(u);
			}
		}
		set.removeAll(remove);
		set.addAll(add);
	}
	
	void run() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			map.clear();
			String zero = null;
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(sc.next(), ": ,.");
				Set<String> set = new HashSet<String>();
				String s = st.nextToken();
				map.put(s, set);
				if (i == 0) zero = s;
				while (st.hasMoreTokens())
					set.add(st.nextToken());
			}
			checked.clear();
			calc(zero);
			out.println(map.get(zero).size());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}