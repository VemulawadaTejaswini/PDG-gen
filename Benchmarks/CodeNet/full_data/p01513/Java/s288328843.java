import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class K {
		Set<Integer> set;
		K() {
			set = new HashSet<Integer>();
		}
	}
	
	void run() {
		int n;
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			K[] member = new K[n];
			for (int i = 0; i < n; i++) {
				member[i] = new K();
				int k = sc.nextInt();
				for (int j = 0; j < k; j++) {
					member[i].set.add(sc.nextInt());
				}
			}
			
			Set<Integer> leak = new HashSet<Integer>();
			int k = sc.nextInt();
			for (int i = 0; i < k; i++)
				leak.add(sc.nextInt());
			
			int count = 0;
			int id = 0;
			for (int i = 0; i < n; i++) {
				if (member[i].set.containsAll(leak)) {
					count++;
					id = i+1;
				}
			}
			
			if (count == 1)
				out.println(id);
			else
				out.println(-1);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}