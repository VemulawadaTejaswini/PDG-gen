
import java.awt.Point;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	class D{
		int x, y, v;
		D(int x, int y, int v) {
			this.x = x;
			this.y = y;
			this.v = v;
		}
	}
	
	class Node implements Comparable<Node> {
		double d;
		int p;
		int id;
		String used;
		int cnt;

		public int compareTo(Node tar) {
			return (Math.abs(d - tar.d) < 1.e-8) ? 0 : (d-tar.d < 0) ? -1 : 1;
		}

		Node(double d, int p, int id, String used, int cnt) {
			this.d = d;
			this.p = p;
			this.id = id;
			this.used = used;
			this.cnt = cnt;
		}
	}

	double dist(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	
	public void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n+m == 0) {
				break;
			}
			D[] s = new D[n];
			Point[] c = new Point[m];
			for(int i=0; i<n; i++) {
				s[i] = new D(sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			for(int i=0; i<m; i++) {
				c[i] = new Point(sc.nextInt(),sc.nextInt());
			}
			
			PriorityQueue<Node> q = new PriorityQueue<Node>();
			HashMap<String,Double> memo = new HashMap<String,Double>();
			for(int i=0; i<m; i++) {
				char[] ss = new char[m];
				Arrays.fill(ss, '0');
				for(int j=0; j<n; j++) {
					ss[i] = '1';
					String sss = new String(ss);
					ss[i] = '0';
					double t = dist(c[i].x, c[i].y, s[j].x, s[j].y) / s[j].v;
					if(!memo.containsKey(sss) || t <= memo.get(sss)) {
						q.add(new Node(t, i, j, sss, 1));
						memo.put(sss, t);
					}
				}
			}
			boolean visited[] = new boolean[m];
			HashSet<String> used = new HashSet<String>();
			for(; !q.isEmpty(); ) {
				Node cur = q.poll();
				if(used.contains(cur.used))
					continue;
				used.add(cur.used);
				boolean ok = true;
				for(int i=0; i<cur.used.length(); i++) {
					if(cur.used.charAt(i) == '0' && !visited[i])
						ok = false;
					if(cur.used.charAt(i) == '1')
						visited[i] = true;
				}
				if(ok) {
					System.out.printf("%.8f",cur.d);
					break;
				}
//				if(cur.cnt == m) {
//					System.out.println(cur.d);
//					break;
//				}
				
				char ns[] = cur.used.toCharArray();
				for(int i=0; i<m; i++) {
					if(ns[i] == '1')
						continue;
					ns[i] = '1';
					String nss = new String(ns);
					ns[i] = '0';
					if(used.contains(nss)){
						continue;
					}
					double nd = cur.d + dist(c[cur.p].x, c[cur.p].y, c[i].x, c[i].y) / s[cur.id].v;
					if(!memo.containsKey(nss) || nd <= memo.get(nss)) {
						memo.put(nss, nd);
						q.add(new Node(nd, i, cur.id, nss, cur.cnt+1));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}