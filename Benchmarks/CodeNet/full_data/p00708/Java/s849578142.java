
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	class E implements Comparable<E> {
		double v;
		int a;
		int b;

		E(double vv, int aa, int bb) {
			v = vv;
			a = aa;
			b = bb;
		}

		public int compareTo(E tar) {
			return v - tar.v > 0 ? 1 : -1;
		}
	}

	class S {
		double x;
		double y;
		double z;
		double r;

		S(double xx, double yy, double zz, double rr) {
			x = xx;
			y = yy;
			z = zz;
			r = rr;
		}

		double dist(S t) {
			double xx = x - t.x;
			double yy = y - t.y;
			double zz = z - t.z;
			double dd = xx * xx + yy * yy + zz * zz;
			double d = Math.sqrt(dd);

			double r2 = r + t.r;

			if (r2 < d) {
				return  d-r2;
			}
			return 0;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			S[] s = new S[n];
			for (int i = 0; i < n; i++) {
				s[i] = new S(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
						sc.nextDouble());
			}
			
			PriorityQueue<E> q = new PriorityQueue<E>();

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					double dd = s[i].dist(s[j]);
					q.add(new E(dd,i,j));
				}
			}
			
			int data[] = new int[n];
			int ne = 0;
			double sum = 0;
			for (;;) {
				if(q.isEmpty()){
					break;
				}
				E now = q.poll();
				if(data[now.a] != 0 && data[now.b] == data[now.a] ){
					continue;
				}
				ne++;
				if((data[now.a] | data[now.b]) == 0){
					data[now.a] = ne;
					data[now.b] = ne;
				}
				if(data[now.a] == 0){
					data[now.a] = data[now.b];
				}
				if(data[now.b] == 0){
					data[now.b] = data[now.a];
				}else{
					for(int i =0 ; i< n ;i++){
						
						if(i!= now.b && data[i] == data[now.b]){
							data[i]= data[now.a];
						}
					}
					data[now.b] = data[now.a];
				}
				sum += now.v;
				if(ne == n-1){
					break;
				}
			}
			long res = (long)(sum * 1000 + 0.5);
			
			System.out.print((res /1000));
			System.out.printf(".%03d\n",(res %1000));
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}