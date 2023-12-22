import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//Treasure Hunt
public class Main{

	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-') return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
	}
	
	class P{
		double x, y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
	
	Comparator<P> xsort = new Comparator<P>() {
		public int compare(P o1, P o2) {
			return (int)Math.signum(o1.x-o2.x);
		}
	};
	Comparator<P> ysort = new Comparator<P>() {
		public int compare(P o1, P o2) {
			return (int)Math.signum(o1.y-o2.y);
		}
	};
	int cnt;
	class Node{
		double lx, rx, ly, ry;
		Node parent;
		Node left, right;
		P point;
		int num;
		public Node(double lx, double rx, double ly, double ry) {
			this.lx = lx;
			this.rx = rx;
			this.ly = ly;
			this.ry = ry;
			parent = left = right = null;
			point = null;
			num = 0;
		}
		int search(double x1, double x2, double y1, double y2){
			if(left==null){
				if(x1 <= point.x && point.x <= x2 && y1 <= point.y && point.y <= y2)return reportAll();
				return 0;
			}
			if(x2 < lx || rx < x1 || y2 < ly || ry < y1)return 0;
			if(x1 <= lx && rx <= x2 && y1 <= ly && ry <= y2){
				return reportAll();
			}
			return left.search(x1, x2, y1, y2) + right.search(x1, x2, y1, y2);
		}
		int reportAll(){
			cnt++;
			if(left==null)return num;
			left.reportAll(); right.reportAll();
			return num;
		}
	}
	Node make2DTree(PriorityQueue<P> q, int depth, double lx, double rx, double ly, double ry, Node parent){
		Node res = new Node(lx, rx, ly, ry);
		res.parent = parent;
		if(q.size()==1){
			res.point = q.poll();
			res.num = 1;
			return res;
		}
		PriorityQueue<P> L = new PriorityQueue<P>(q.size(), depth%2==1?xsort:ysort);
		PriorityQueue<P> R = new PriorityQueue<P>(q.size(), depth%2==1?xsort:ysort);
		int mid = (q.size()-1)/2, idx = 0;
		while(!q.isEmpty()){
			if(idx==mid)res.point = q.peek();
			if(idx++ <= mid)L.add(q.poll());
			else R.add(q.poll());
		}
		if(depth%2==0){
			res.left = make2DTree(L, depth+1, lx, res.point.x, ly, ry, res);
			res.right = make2DTree(R, depth+1, res.point.x, rx, ly, ry, res);
		}
		else{
			res.left = make2DTree(L, depth+1, lx, rx, ly, res.point.y, res);
			res.right = make2DTree(R, depth+1, lx, rx, res.point.y, ry, res);
		}
		res.num = res.left.num + res.right.num;
		return res;
	}
	Node make(List<P> list, double lx, double rx, double ly, double ry){
		PriorityQueue<P> q = new PriorityQueue<P>(list.size(), xsort);
		for(P p:list)q.add(p);
		return make2DTree(q, 0, lx, rx, ly, ry, null);
	}
	
	void run(){
		Scanner sc = new Scanner();
		int n = sc.nextInt(), m = sc.nextInt();
//		long T = System.currentTimeMillis();
		int INF = 1<<30;
		List<P> p = new ArrayList<P>();
		for(int i=0;i<n;i++)p.add(new P(sc.nextInt(), sc.nextInt()));
		Node root = make(p, -INF, INF, -INF, INF);
		while(m--!=0){
			cnt = 0;
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
//			System.out.println(root.search(x1, x2, y1, y2));
			root.search(x1, x2, y1, y2);
			System.out.println(cnt);
		}
//		System.out.println(root.num);
//		System.out.println(System.currentTimeMillis()-T+" ms.");
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}