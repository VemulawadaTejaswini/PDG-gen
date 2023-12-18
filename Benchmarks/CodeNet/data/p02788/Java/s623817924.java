import java.util.*;

public class Main {
	static class Monster {
		int X,H;

		public Monster(int x, int h) {
			X = x;
			H = h;
		}
		
	}
	static class RangeQuery {
		int N;
		long[] v1;
		long[] v2;
		
		public RangeQuery(int n) {
			N=1;
			while(N<n)
				N<<=1;
			v1 = new long[N*2-1];
			v2 = new long[N*2-1];
		}
		
		public void set(int i, long value) {
			i+=N-1;
			v1[i] = value;
			while(i>0) {
				i = (i-1)/2;
				v1[i] = Math.max(v1[i*2+1], v1[i*2+2]);
			}
		}
		
		//maximum value in range [a, b)
		public long getMax(int a, int b) {
			return getMax(a, b, 0, 0, N);
		}
		public long getMax(int a, int b, int k, int l, int r) {
			if(a<=l && r<=b) {
				long ans = v1[k];
				while(k>0) {
					k = (k-1)/2;
					ans += v2[k];
				}
				return ans;
			} else if(r<=a || b<=l) {
				return 0;
			} else {
				return Math.max(getMax(a, b, k*2+1, l, (l+r)/2), getMax(a, b, k*2+2, (l+r)/2, r));
			}
		}
		
		public void add(int a, int b, long v) {
			add(a, b, v, 0, 0, N);
		}
		public void add(int a, int b, long v, int k, int l, int r) {
			if(a<=l && r<=b) {
				v2[k] += v;
				v1[k] += v;
				while(k>0) {
					k = (k-1)/2;
//					v1[k] = Math.max(v1[k*2+1], v1[k*2+2]);
					v1[k] = Math.max(getMax(a, b, k*2+1, l, (l+r)/2), getMax(a, b, k*2+2, (l+r)/2, r));
				}
			} else if(r<=a || b<=l) {
				return;
			} else {
				add(a, b, v, k*2+1, l, (l+r)/2);
				add(a, b, v, k*2+2, (l+r)/2, r);
			}
		}
		
		public int getleftmost() {
			if(v1[0]<=0)
				return N;
			long sum = 0;
			int k = 0;
			while(k*2+2 < N*2-1) {
				sum += v2[k];
				if(v1[k*2+1]+sum>0)
					k = k*2+1;
				else
					k = k*2+2;
			}
			return k-(N-1);
		}
		
		public long get(int i) {
			return v1[i+N-1];
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		int A = sc.nextInt();
		Monster[] monster = new Monster[N];
		for(int i=0; i<N; i++) {
			monster[i] = new Monster(sc.nextInt(), sc.nextInt());
		}
		
		RangeQuery rq = new RangeQuery(N);
		Arrays.sort(monster, new Comparator<Monster>() {
			public int compare(Monster m1, Monster m2) {
				return Integer.compare(m1.X, m2.X); 
			}
		});
		for(int i=0; i<N; i++)
			rq.set(i, monster[i].H);
		
		int[] XX = new int[N];
		for(int i=0; i<N; i++)
			XX[i] = monster[i].X;
		
		long ans = 0;
		
		int l = 0;
//		while(rq.getMax(0, N)>0) {
//			int r = N;
//			while(l+1<r) {
//				int mid = (l+r)/2;
//				if(rq.getMax(l, mid)>0) {
//					r = mid;
//				} else {
//					l = mid;
//				}
//			}
		while(true) {
			l = rq.getleftmost();
			if(l>=N)
				break;
			
			int to = monster[l].X + D*2;
			int idx = Arrays.binarySearch(XX, to);
			if(idx<0)
				idx = -idx-2;
			long bomb = (rq.getMax(l, l+1)+A-1)/A;
			rq.add(l, idx+1, -A*bomb);
			ans+=bomb;
		}
		
		System.out.println(ans);
		sc.close();
	}
	
}
