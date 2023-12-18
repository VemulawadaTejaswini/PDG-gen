import java.util.*;
public class Main {
	public static void main(String[] args){
		rgbColoring();
	}
	
	public static void rgbColoring() {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		if (k == 0) {
			System.out.println(1);
			return;
		}
		ArrayList<ArrayList<Long>> comb = new ArrayList<>();
		for (long i=0; i*a<k; i++) {
			for (long j=0; j*b<k; j++) {
				for(long m=0; m*(a+b)<k; m++) {
					if ((m*(a+b) + j*b + i*a) == k) {
						ArrayList<Long> temp = new ArrayList<>();
						temp.add(i);
						temp.add(j);
						temp.add(m);
						comb.add(temp);
					}
				}
			}
		}
		int res = 0;
		for (int i=0; i<comb.size(); i++) {
			res += calComb(comb.get(i), num);
		}
		System.out.println(res % 998244353);
	}
	
	public static long calComb(ArrayList<Long> l, long num) {
		long res = 0;
		long red = l.get(0);
		long blue = l.get(1);
		long green = l.get(2);
		res = cal2(red, num) * cal2(blue, num-red) * cal2(green, num-red-blue);
		return res;
	}
	
	public static long cal2(long n, long m) {
		if (n == 0) return 1;
		long u = 1, d = 1;
		while (n > 0) {
			d *= n;
			u *= m;
			n--;
			m--;
		}
		return u/d;
	}
}