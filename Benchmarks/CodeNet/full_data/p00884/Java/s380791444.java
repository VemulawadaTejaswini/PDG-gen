// Membership Management
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			String[][] data = new String[n][];
			for (int i = 0; i < n; i++)
				data[i] = scanner.next().replace(".", "").split("[:,]");
			Queue<Integer> queue = new LinkedList<Integer>();
			Set<String> result = new HashSet<String>();
			queue.add(0);
			while (!queue.isEmpty()) {
				int group = queue.poll();
				out: for (int i = 1; i < data[group].length; i++) {
					for (int j = 1; j < n; j++) {
						if (data[j][0].equals(data[group][i])) {
							queue.add(j);
							continue out;
						}
					}
					result.add(data[group][i]);
				}
			}
			System.out.println(result.size());
		}
		scanner.close();
	}
}