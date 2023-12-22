import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	String[] a = new String[10];
	String[] b = new String[10];
	int dlen;
	
	String substitute(String s, int i) {
		StringBuilder res = new StringBuilder();
		int index = 0, n = s.length(), len = a[i].length();
		boolean flag = false;
		while (index < n) {
			if (index+len <= n && s.substring(index, index+len).equals(a[i])) {
				res.append(b[i]);
				index += len;
				flag = true;
			} else {
				res.append(s.charAt(index));
				index++;
			}
		}
		if (!flag || res.length() > dlen)
			return null;
		else
			return res.toString();
	}
	
	void run() {
		Queue<String> que = new LinkedList<String>();
		Queue<Integer> num = new LinkedList<Integer>();
		W:while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				a[i] = sc.next();
				b[i] = sc.next();
			}
			String c = sc.next(), d = sc.next();
			dlen = d.length();
			que.clear();
			num.clear();
			que.add(c);
			num.add(0);
			while (!que.isEmpty()) {
				String s = que.poll();
				int count = num.poll();
				for (int i = 0; i < n; i++) {
					String t = substitute(s, i);
					if (t != null) {
						if (t.equals(d)) {
							out.println(count+1);
							continue W;
						}
						que.add(t);
						num.add(count+1);
					}
				}
			}
			out.println(-1);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}