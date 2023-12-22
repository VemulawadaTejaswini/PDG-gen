import java.util.Scanner;

//Lightest Mobile
public class Main{

	static long gcd(long a, long b){
		if(a < b){
			long tmp = a;
			a = b;
			b = tmp;
		}
		while(b!=0){
			long r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

	class R{
		int p, q;
		R l, r, parent;
		public R() {
			l = r = parent = null;
		}
		long solve(){
			long left = l.p==0?1:(l.p+l.q);
			long right = r.p==0?1:(r.p+r.q);
			long g = gcd(left, right);
			long x = left*right/g;
//			System.out.println("Left:" + left + " Right:" + right + " GCD:" + g + " X:" + x);
//			System.out.println("P:" + p + " Q:" + q);
			long val = x;
			while(true){
//				System.out.println("val:" + val);
				if(val%(p+q)==0){
					long s = val/(p+q);
					if(l.f(s*q)&&r.f(s*p))break;
				}
				val+=x;
			}
			return val;
		}
		boolean f(long x){
			if(p==0)return true;
			if(x%(p+q)!=0)return false;
			long s = x/(p+q);
			return l.f(s*q)&&r.f(s*p);
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			R[] s = new R[n+1];
			for(int i=0;i<=n;i++)s[i]=new R();
			for(int i=1;i<=n;i++){
				s[i].p = sc.nextInt();
				s[i].q = sc.nextInt();
				long g = gcd(s[i].p, s[i].q);
				s[i].p/=g;
				s[i].q/=g;
				int l = sc.nextInt();
				int r = sc.nextInt();
				s[i].l = s[l];
				s[i].r = s[r];
				s[l].parent = s[i];
				s[r].parent = s[i];
			}
			R root = null;
			for(int i=1;i<=n;i++)if(s[i].parent==null)root = s[i];
			System.out.println(root.solve());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}