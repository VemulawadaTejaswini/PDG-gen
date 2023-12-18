import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Main{
	static boolean ip(long x) {
		if(x == 1) return false;
		for(long i = 2; i * i <= x; i++) if(x % i == 0) return false;
		return true;
	}
	static LinkedList<Long> fact(long n) {
		long tn = n;
		LinkedList<Long> factorize = new LinkedList<Long>();
		if(ip(n)) {
			factorize.add(n);
			n /= n;
		}
		for(long i = 2; i <= tn; i++) {
			if(n == 1) break;
			if(ip(i)) {
				while(n % i == 0) {
					factorize.add(i);
					n /= i;
				}
			}
		}
		return factorize;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		TreeMap<Long, Long> map = new TreeMap<Long, Long>();
		for(long i = 2; i <= N; i++) {
			LinkedList<Long> tmp = fact(i);
			for(long t : tmp) {
				map.put(t, (map.containsKey(t)) ? map.get(t) + 1 : 1);
			}
		}
		long ans = 1;
		for(Entry<Long, Long> ent : map.entrySet()) {
			ans *= ent.getValue() + 1;
			ans %= (1000000000 + 7);
		}
		System.out.println(ans);
	}
}