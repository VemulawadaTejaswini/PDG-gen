import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);

	static int gcd(int a,int b){
		return a%b==0?b:gcd(b,a%b);
	}

	void solve(){
		int n=gInt(),m=gInt();
		int gcd=gcd(n,m);
		long x=(long)n*m;
		
		long lcm=x/gcd;
		String a=s.next(),b=s.next();
		
		for(int i=0;i<gcd;++i) {
			if(a.charAt(n/gcd*i)!=b.charAt(m/gcd*i)) {
				//System.out.println(a.charAt(n/gcd*i)+" "+b.charAt(m/gcd*i));
				System.out.println(-1);
				return;
			}
		}
		System.out.println(lcm);
	}

	public static void main(String[] A){
		new Main().solve();
	}

	static int gInt(){
		return Integer.parseInt(s.next());
	}
	static long gLong(){
		return Long.parseLong(s.next());
	}
	static double gDouble(){
		return Double.parseDouble(s.next());
	}

	IntStream REP(int n){
		return REP(0,n-1);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return IntStream.generate(Main::gInt).limit(n);
	}
}
