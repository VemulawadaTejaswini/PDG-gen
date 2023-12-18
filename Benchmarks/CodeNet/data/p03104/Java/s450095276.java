import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	void A() {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		System.out.println(Math.max(0,(H-h)*(W-w)));
	}
	void B() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int ans = 0;
		int []  B = new int[M];
		int [] A = new int[M];
		for(int i = 0; i < M; i++) B[i] = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int tmp = C;
			for(int j = 0; j < M; j++) {
				A[j] = sc.nextInt();
				tmp += A[j] * B[j];
			}
			if(tmp>0) ans++;
		}
		System.out.println(ans);
	}
	void C() {
		int N = sc.nextInt();
		long M = sc.nextLong();
		Pair [] data = new Pair[N];
		for(int i = 0; i < N; i++) {
			long a = sc.nextLong(), b = sc.nextLong();
			data[i] = new Pair(a,b);
		}
		Arrays.sort(data);
		long ans = 0;
		for(int i = 0; i < N; i++) {
			if((int)data[i].b <= M) {
				ans  += data[i].a * data[i].b;
			} else {
				ans += (long) M * data[i].a;
			}
			M -= data[i].b;
			//System.out.println(ans + " " + data[i].a + " " + data[i].b + " " + M);
			if(M <=0) break;
		}
		System.out.println(ans);
	}
	class Pair implements Comparable<Pair>{
		long a, b;
		Pair(long a, long b) {
			this.a = a; this.b = b;
		}
		public int compareTo(Pair other) {
			if(this.a < other.a) return -1;
			if(this.a > other.a) return +1;
			if(this.b < other.b) return -1;
			if(this.b > other.b)return +1;
			return 0;
		}
	}
	long Df(long a, int bit) {
		a++;
		long b = 1L << bit;
		long c = b * 2L;
		long ans = a / c * b;
		ans += Math.max(a % c - b, 0L);
		//System.out.println(a + ":" + bit + " " + b + " " + c + " " + ans);
		return ans;
	}
	void D() {
		long A = sc.nextLong();
		long B = sc.nextLong();
		long ans = 0;
		
		for(int i = 0; i < 50; i++) {
			long a1 = Df(A-1L, i);
			long b1 = Df(B, i);
			if((b1-a1) % 2L != 0L) {
				ans += (1L << i);
			}
			//System.out.println(i + " " + (1L<<i) + " " + a1 + " " + b1 + " " + ans);
		}
		System.out.println(ans);
	}
	void doIt() {
		D();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}
