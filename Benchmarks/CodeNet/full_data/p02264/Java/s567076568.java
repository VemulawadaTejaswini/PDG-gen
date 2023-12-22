import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] arr = line.split(" ");
		int n = Integer.parseInt(arr[0]);
		int q = Integer.parseInt(arr[1]);

		Queue<Process> queue = new LinkedList<Process>();
		for (int i = 0; i < n; i++) {
			line = br.readLine();
			arr = line.split(" ");
			Process p = new Process();
			p.name = arr[0];
			p.time = Integer.parseInt(arr[1]);
			queue.offer(p);
		}

		int passed = 0;
		while (queue.size() > 0) {
			Process p = queue.poll();
			if (p.time <= q) {
				passed += p.time;
				System.out.println(p.name + ' ' + passed);
			} else {
				passed += q;
				p.time -= q;
				queue.offer(p);
			}
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}

	private static class Process {
		public String name;
		public int time;
	}
}