import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;

	Set<Long> setA = new HashSet<>();
	Set<Long> setB = new HashSet<>();
	void doIt() {
		long a = sc.nextLong();
		long b = sc.nextLong();
		long len = a;
		setA.add(1l); setB.add(1l);
		for(long i = 2; i * i< len; i++) {
			while(a % i == 0) {
				a /= i;
				setA.add(i);
				//System.out.println(a + " " + i);
			}
		}
		setA.add(a);
		len = b;
		for(long i = 2; i * i < len; i++) {
			while(b % i == 0) {
				b /= i;
				setB.add(i);
			}
		}
		setB.add(b);
		long cnt = 0;
		for(long i : setA) {
			if(setB.contains(i)) {
				cnt++;
			}
		}
		//System.out.println(Arrays.toString(setA.toArray()));
		System.out.println(cnt);

	}



	public static void main(String[] args) {
		new Main().doIt();
	}
}
