import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> que1 = new PriorityQueue<>((o1, o2) -> o2 - o1);
		PriorityQueue<Integer> que2 = new PriorityQueue<>();
		String[] sa = br.readLine().split(" ");
		que2.add(Integer.parseInt(sa[1]));
		long sum = Integer.parseInt(sa[2]);
		int cnt = 1;
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 1; i < q; i++) {
			sa = br.readLine().split(" ");
			if (sa[0].equals("1")) {
				int a = Integer.parseInt(sa[1]);
				int o = 0;
				if (cnt % 2 == 1) {
					o = que2.poll();
				} else {
					o = que1.poll();
				}
				que1.add(Math.min(o, a));
				que2.add(Math.max(o, a));
				sum += Integer.parseInt(sa[2]);
				cnt++;
			} else {
				if (cnt % 2 == 1) {
					int o = que2.peek();
					pw.println(o + " " + sum);
				} else {
					int o1 = que1.peek();
					int o2 = que2.peek();
					pw.println(o1 + " " + (sum + o2 - o1));
				}
			}
		}
		pw.flush();
		br.close();
	}
}
