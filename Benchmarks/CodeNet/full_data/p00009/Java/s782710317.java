import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		while (line != null) {
			StringTokenizer tk = new StringTokenizer(line);
			int n = Integer.parseInt(tk.nextToken());
			if (n <= 1) {
				System.out.println(0);
			}
			else {
				Queue<Integer> queue = new LinkedList<Integer>();
				for(int i = 2; i <= n; i++) {
					queue.add(i);
				}
				int p = queue.remove();
				queue.add(p);
				do {
					while (queue.element() != p) {
						int temp = queue.remove();
						if (temp % p != 0) {
							queue.add(temp);
						}
					}
					queue.add(queue.remove());
					p = queue.remove();
					queue.add(p);
				} while (p != 2);
				
				int length = 0;
				while (!queue.isEmpty()){
					length ++;
					queue.remove();
				}
				System.out.println(length);
			}
			line = in.readLine();
		}
	}
}