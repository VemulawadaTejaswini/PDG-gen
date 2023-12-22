import java.util.Arrays;
import java.util.Scanner;

//Power
public class Main{

	class R implements Comparable<R>{
		int s, t;
		public R(int s, int t) {
			this.s = s;
			this.t = t;
		}
		public int compareTo(R o) {
			return s-o.s;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		R[] r = new R[M];
		for(int i=0;i<M;i++)r[i]=new R(sc.nextInt(), sc.nextInt());
		Arrays.sort(r);
		int res = 0, f = 0, i = 0;
		while(i<M&&f<N){
			if(f+1<r[i].s)break;
			int max = r[i].t;
			while(i<M){
				if(f+1<r[i].s){
					i--; break;
				}
				max = Math.max(max, r[i++].t);
			}
			f = max;
			res++;
		}
		System.out.println(f==N?res:"Impossible");
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}