  import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {

	static ArrayDeque<String> queue = new ArrayDeque<String>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		queue.add(br.readLine().replace("insert ", ""));
		for (int i = 0; i < n; i++) {
			String order = br.readLine();
			if (order.contains("F")) {
				queue.poll();
			} else if (order.contains("L")) {
				queue.pollLast();
			} else if (order.contains("insert")) {
				queue.add(order.replace("insert ", ""));
			} else {
				queue.removeFirstOccurrence(order.replace("delete ", ""));
			}
		}
		while(queue.isEmpty() != true){
			System.out.println(queue.pollLast());
		}
	}
}