// Membership Management
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			String[] data = new String[n];
			for (int i = 0; i < n; i++)
				data[i] = scanner.next();
			Queue<Integer> queue = new LinkedList<Integer>();
			Set<String> result = new HashSet<String>();
			queue.add(0);
			while (!queue.isEmpty()) {
				int group = queue.poll();
				String[] members = data[group].split("[:,\.]");
				out: for (int i = 1; i < members.length; i++) {
					for (int j = 0; j < data.length; j++) {
						String name = members[i];
						if (data[j].indexOf(members[i]) == 0) {
							queue.add(j);
							continue out;
						}
					}
					result.add(members[i]);
				}
			}
			System.out.println(result.size());
		}
		scanner.close();
	}
}