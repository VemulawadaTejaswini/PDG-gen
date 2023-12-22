import java.util.*;

public class Main{

	//1344 start

	class C implements Comparable<C>{
		int p,a,b,c,d,e,f,s,m;
		String name;
		int time, sum;
		double value;

		public C(int p,int a, int b, int c, int d, int e, int f, int s, int m,
				String name, int time, int sum, double value) {
			this.p = p;
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
			this.s = s;
			this.m = m;
			this.name = name;
			this.time = time;
			this.sum = sum;
			this.value = value;
		}

		@Override
		public int compareTo(C o) {
			if(this.value < o.value) return -1;
			if(this.value > o.value) return 1;
			return -1 * this.name.compareTo(o.name);
		}

		@Override
		public String toString() {
			return "C [p=" + p + ", a=" + a + ", b=" + b + ", c=" + c + ", d="
					+ d + ", e=" + e + ", f=" + f + ", s=" + s + ", m=" + m
					+ ", name=" + name + ", time=" + time + ", sum=" + sum
					+ ", value=" + value + "]";
		}

		
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			C [] data = new C[n];
			for(int i = 0 ; i < n; i++){
				String l = sc.next();
				int p = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				int e = sc.nextInt();
				int f = sc.nextInt();
				int s = sc.nextInt();
				int m = sc.nextInt();
				C now = new C(p, a, b, c, d, e, f, s, m, l, 0, 0, 0.0);
				data[i] = now;
			}

			for(int i = 0 ; i < n; i++){
				data[i].time += data[i].a + data[i].b + data[i].c;
				data[i].sum = data[i].s * data[i].m * data[i].f- data[i].p;
				for(int j = 0 ; j < data[i].m; j++){
					data[i].time += data[i].d + data[i].e;
				}
				data[i].value = (double)data[i].sum / data[i].time;
			}
			Arrays.sort(data);
			for(int i = n-1; i >= 0; i--){
				System.out.println(data[i].name);
				//System.out.println(data[i]);
			}
			System.out.println("#");
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}