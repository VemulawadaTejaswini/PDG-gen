import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Nails
public class Main{

//	class Scanner {
//		int nextInt() {
//			try {
//				int c = System.in.read();
//				while (c != '-' && (c < '0' || '9' < c))
//					c = System.in.read();
//				if (c == '-') return -nextInt();
//				int res = 0;
//				do {
//					res *= 10;
//					res += c - '0';
//					c = System.in.read();
//				} while ('0' <= c && c <= '9');
//				return res;
//			} catch (Exception e) {
//				return -1;
//			}
//		}
//	}

	class R implements Comparable<R>{
		int a, b, x;
		public R(int a, int b, int x) {
			this.a = a;
			this.b = b;
			this.x = x;
		}
		public int compareTo(R o) {
			return o.x-x;
		}
	}

	int X = 5001;
	int[][] t;
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
//		long T = System.currentTimeMillis();
		t = new int[n+1][];
		boolean[][] mark = new boolean[n+1][];
		for(int i=1;i<=n;i++){
			t[i] = new int[i+1];
			mark[i] = new boolean[i+1];
			Arrays.fill(t[i], -1);
		}
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(m, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return t[o2/X][o2%X]-t[o1/X][o1%X];
			}
		});
		while(m--!=0){
			int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt();
			if(t[a][b]<x){
//				q.remove(a*X+b); 
				t[a][b] = x; q.add(a*X+b);
			}
		}
		int res = 0;
		while(!q.isEmpty()){
//			System.out.println(q.size());
//			System.out.println(res);
			int v = q.poll();
			int a = v/X, b = v%X;
			if(!mark[a][b])res++;
			mark[a][b] = true;
			if(t[a][b]==0)continue;
			if(t[a+1][b]<t[a][b]-1){
//				q.remove((a+1)*X+b); 
				t[a+1][b] = t[a][b]-1; q.add((a+1)*X+b);
			}
			if(t[a+1][b+1]<t[a][b]-1){
//				q.remove((a+1)*X+b+1); 
				t[a+1][b+1] = t[a][b]-1; q.add((a+1)*X+b+1);
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}