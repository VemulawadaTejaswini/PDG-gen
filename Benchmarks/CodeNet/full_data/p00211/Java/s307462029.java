import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			Fraction[] f = new Fraction[n];

			for(int i=0;i<n;i++){
				f[i] = new Fraction(sc.nextLong(),sc.nextLong());
				long g = f[i].gcd(f[i].p,f[i].q);
				f[i].p /= g;
				f[i].q /= g;
			}

			Fraction fl = f[0];
			for(int i=1;i<n;i++) fl = fl.flcm(f[i]);

			for(int i=0;i<n;i++) System.out.println(fl.q == 1 ? fl.p / f[i].p * f[i].q : "1");
		}
	}
}

class Fraction{
	long p,q;

	Fraction(long p,long q){
		this.p = p;
		this.q = q;
	}

	long gcd(long a,long b){
		return b == 0 ? a : gcd(b,a%b);
	}

	long lcm(long a,long b){
		return a / gcd(a,b) * b;
	}

	Fraction flcm(Fraction f){
		Fraction res = new Fraction(lcm(this.p * f.q, f.p * this.q), this.q * f.q);

		long g = gcd(res.p, res.q);
		res.p /= g;
		res.q /= g;

		return res;
	}
}