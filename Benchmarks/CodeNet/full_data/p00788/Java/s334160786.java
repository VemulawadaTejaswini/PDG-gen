import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	int gcd(int x, int y){ return y==0?x:gcd(y,x%y); }

	class Frac{
		int a, b;
		Frac(int _a, int _b){
			int d = _a==0?1:gcd(_a,_b);
			this.a = _a/d;
			this.b = _b/d;
		}
	}

	long[] sqs;

	class Cmp implements Comparator<Frac>{
		public int compare(Frac x, Frac y){
			int dif = x.a*y.b - x.b*y.a;
			return Integer.signum(dif);
		}
	}

	void run(){
		Scanner in = new Scanner(System.in);
		init();
		for(;;){
			int p = in.nextInt(), n = in.nextInt();
			if(n==0 && p==0) return ;
			solve(n,p);
		}
	}

	void init(){
		sqs = new long[10005];
		for(int i=0; i<10005; i++){
			sqs[i] = (long)i*i;
		}
	}

	void solve(int n, int p){
		Frac[] lower = new Frac[n], upper = new Frac[n];
		lower[0] = new Frac((int)sqrt(p),1);
		upper[0] = new Frac((int)(sqrt(p)+1),1);
		for(int i=2; i<=n; i++){
			int id = - 1 - binarySearch(sqs, (long)p*i*i);
			if(1<=id-1 && id-1<=n) lower[i-1] = new Frac(id-1,i);
			else lower[i-1] = new Frac(0,1);
			if(1<=id && id<=n) upper[i-1] = new Frac(id, i);
			else upper[i-1] = new Frac(p,1);
		}
		sort(lower, new Cmp());
		sort(upper, new Cmp());
		System.out.printf("%d/%d %d/%d\n", upper[0].a, upper[0].b, lower[n-1].a, lower[n-1].b);
	}

	public static void main(String args[]){
		new Main().run();
	}
}