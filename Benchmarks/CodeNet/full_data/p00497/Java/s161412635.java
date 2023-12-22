import java.util.Arrays;
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

	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
//		long T = System.currentTimeMillis();
		int[][] t = new int[n+1][];
		for(int i=1;i<=n;i++){
			t[i] = new int[i+1];
			Arrays.fill(t[i], -1);
		}
		R[] rs = new R[m];
		for(int i=0;i<m;i++)rs[i]=new R(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Arrays.sort(rs);
		for(R r:rs){
			if(r.x<=t[r.a][r.b])continue;
			int k = r.x, R = 0;
			for(int i=r.a;i<=r.a+r.x;i++, R++, k--)for(int j=r.b;j<=r.b+R;j++)t[i][j]=Math.max(t[i][j], k);
		}
		int res = 0;
		for(int i=1;i<=n;i++)for(int j=1;j<=i;j++)res+=t[i][j]==-1?0:1;
//		List<Integer>[] l = new List[n+1];
//		for(int i=1;i<=n;i++){
//			l[i] = new LinkedList<Integer>();
//			for(int j=1;j<=i;j++)l[i].add(j);
//		}
//		while(m--!=0){
//			int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt(), r = b;
//			for(int i=a;i<=a+k;i++, r++){
//				for(int j=0;j<l[i].size();j++){
//					if(l[i].get(j)<b)continue;
//					if(r<l[i].get(j))break;
//					l[i].remove(j--);
//				}
//			}
//		}
//		int res = n*(n+1)/2;
//		for(int i=1;i<=n;i++){
//			res-=l[i].size();
			//			for(int x:l[i])System.out.print("("+i+","+x+")");
			//			System.out.println();
//		}
		System.out.println(res);
//		System.out.println((System.currentTimeMillis()-T));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}