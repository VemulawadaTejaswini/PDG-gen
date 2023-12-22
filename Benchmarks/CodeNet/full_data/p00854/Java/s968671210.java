import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, k, m;
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			n = sc.nextInt(); k = sc.nextInt(); m = sc.nextInt();
			if (n == 0) break;
			for (int i = 1; i <= n; i++)
				list.add(i);
			int index = m-1;
			while (true) {
				if (list.size() == 1) break;
				list.remove(index);
				index = (index+k-1)%list.size();
			}
			out.println(list.get(0));
			list.clear();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}