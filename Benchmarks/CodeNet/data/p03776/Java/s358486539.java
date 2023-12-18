import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		c = new long[51][51];
		long[] v = new long[n];
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		for (int i = 0; i < n; i++) v[i] = -sc.nextLong();
		Arrays.sort(v);
		for (int i = 0; i < n; i++) {
			long val = -v[i];
			if(!map.containsKey(val)) {
				map.put(val,1);
			}else {
				map.replace(val, map.get(val)+1);
			}
			v[i] = val;
		}
		long count = 0;
		int k = 1;
		long sum = 0;
		while(k <= a) {
			sum += v[k-1];
			k++;
		}
		while((k-1)*v[k]>sum&&k<=b) {
			sum += v[k];
			k++;
		}
		Fraction frac = new Fraction(sum, k-1);
		for (int i = a; i <= b; i++) {
			k = 1;
			sum = 0;
			Map<Long, Integer> map2 = new HashMap<Long, Integer>();
			while(k <= a) {
				sum += v[k-1];
				if(!map2.containsKey(v[k-1])) {
					map2.put(v[k-1],1);
				}else {
					map2.replace(v[k-1], map2.get(v[k-1])+1);
				}
				k++;
			}
			while(k<=i&&(k-1)*v[k-1]>=sum) {
				sum += v[k-1];
				if(!map2.containsKey(v[k-1])) {
					map2.put(v[k-1],1);
				}else {
					map2.replace(v[k-1], map2.get(v[k-1])+1);
				}
				k++;
			}
			if(k-1!=i) {
				continue;
			}
			Fraction frac2 = new Fraction(sum, k-1);
			if(frac2.equals(frac)) {
				System.out.printf("%d %d %d\n",i,map.get(v[i-1]), map2.get(v[i-1]));
				System.out.println(comb(map.get(v[i-1]),map2.get(v[i-1])));
				count += comb(map.get(v[i-1]),map2.get(v[i-1]));
			}
		}
		System.out.println(frac.get_value());
		System.out.println(count);
		sc.close();
	}
	public static long[][] c;

	public static long comb(long a, long b) {
		if(c[(int)a][(int)b] == 0) {
			long res;
			if(b == 0) res = 1;
			else if(a == b) res = 1;
			else res = comb(a-1,b)+comb(a-1,b-1);
			c[(int)a][(int)b] = res;
			return res;
		}else {
			return c[(int)a][(int)b];
		}
	}
	public static class Fraction{
		long bunbo, bunshi;
		public Fraction(long u, long d){
			this.bunbo = d/gcd(u,d);
			this.bunshi = u/gcd(u,d);
		}
		public boolean equals(Fraction f) {
			return f.bunbo==bunbo&&f.bunshi==bunshi;
		}
		public double get_value() {
			return (double)this.bunshi/(double)this.bunbo;
		}
		public long gcd(long a, long b) {
			if(a < b) {
				long c = a;
				a = b;
				b = c;
			}
			while(b != 0) {
				long c = a;
				a = b;
				b = c%b;
			}
			return a;
		}
	}
}