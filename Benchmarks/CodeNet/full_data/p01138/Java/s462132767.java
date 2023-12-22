import java.util.Arrays;
import java.util.Scanner;


public class Main{

	class E implements Comparable<E>{
		int t, p;
		public E(int t, int p) {
			this.t = t;
			this.p = p;
		}
		public int compareTo(E o) {
			return t!=o.t?t-o.t:p-o.p;
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			E[] e = new E[n*2];
			for(int i=0;i<n;i++){
				String[] r = sc.next().split(":"), v = sc.next().split(":");
				int s = Integer.parseInt(r[0])*3600+Integer.parseInt(r[1])*60+Integer.parseInt(r[2]);
				int t = Integer.parseInt(v[0])*3600+Integer.parseInt(v[1])*60+Integer.parseInt(v[2]);
				e[i] = new E(s, 0); e[i+n] = new E(t, -1);
			}
			Arrays.sort(e);
			int res = 0, c = 0;
			for(E v:e){
				if(v.p==0)c++;else c--;
				res = Math.max(res, c);
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}