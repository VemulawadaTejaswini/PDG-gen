import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}
	
	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int [] ua = unique(a);
		int gcd = 1;
		int size = ua.length;	
		for (int i = 0; i < size; i++) {
			gcd = calcGcd(gcd, ua[i]);
		}


		long lcm = 1;
		for (int i = 0; i < size; i++) {
			lcm *= ua[i]/gcd;
		}
		final long m = lcm -1;
		long f = 0;
		for (int i = 0; i < N; i++) {
			f += m % a[i];
		}
		System.out.println(f);
		sc.close();

	}
	
	private int [] unique(int [] array) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i=0; i< array.length; i++) {
			s.add(array[i]);
		}
		int [] uniq = new int[s.size()];
		int idx=0;
		for (Integer elem:s) {
			uniq[idx++] = elem;
		}
		return uniq;
	}
	
	private int calcGcd (int a, int b) {
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 0) {
			return a;
		}
		else {
			return calcGcd(b, a%b);
		}
	}
}
