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
		int x = Integer.parseInt(sa[1]);
		que1.add(x);
		long y = Integer.parseInt(sa[2]);
		int cnt = 1;
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 1; i < q; i++) {
			sa = br.readLine().split(" ");
			if (sa[0].equals("1")) {
				int a = Integer.parseInt(sa[1]);
				int o = 0;
				if (cnt % 2 == 1) {
					o = que1.poll();
				} else {
					o = que2.poll();
				}
				que1.add(Math.min(o, a));
				que2.add(Math.max(o, a));
				cnt++;
				int nx = que1.peek();
				if (cnt % 2 == 1) {
					y += Math.abs(a - nx);
				} else {
					y += Math.abs(a - x);
				}
				x = nx;
				y += Integer.parseInt(sa[2]);
			} else {
				pw.println(x + " " + y);
			}
		}
		pw.flush();
		br.close();
	}
}
