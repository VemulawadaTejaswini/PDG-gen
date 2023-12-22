import java.util.*;

public class Main {
	//static List<Integer> primenumbers;
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		//setPrimeNumbers(300000);
		while(stdin.hasNext()) {
			int n = stdin.nextInt();
			if (n == 1) break;
			Iterator it = calculateMSPF(n).iterator();
			System.out.print(n + ": ");
			if (! it.hasNext()) System.out.print(n);
			while (it.hasNext()) {
				System.out.print(Integer.parseInt(it.next().toString()));
				if (it.hasNext()) System.out.print(" ");
			}
			System.out.println("");
		}
		System.exit(0);
	}

	/*public static void setPrimeNumbers(int n) {
		BitSet isntprime = new BitSet(n);
		isntprime.set(0, true);
		isntprime.set(1, true);
		for ()
	}*/

	public static boolean isMSNumber(int n) {
		int d = n % 7;
		return d == 1 || d == 6;
	}

	public static boolean isMSPrime(int n) {
		if (! isMSNumber(n)) return false;
		return calculateMSDivisors(n).size() == 2;
	}

	public static List<Integer> calculateDivisors(int n) {
		List<Integer> ds = new ArrayList<Integer>();
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) ds.add(i);
		}
		ds.add(n);
		return ds;
	} 

	public static List<Integer> calculateMSDivisors(int n) {
		List<Integer> msds = new ArrayList<Integer>();
		Iterator it = calculateDivisors(n).iterator();
		while (it.hasNext()) {
			int d = Integer.parseInt(it.next().toString());
			if (isMSNumber(d)) msds.add(d);
		}
		return msds;
	}

	public static List<Integer> calculateMSPF(int n) {
		List<Integer> mspfs = new ArrayList<Integer>();
		Iterator it = calculateMSDivisors(n).iterator();
		while (it.hasNext()) {
			int msd = Integer.parseInt(it.next().toString());
			if (isMSPrime(msd)) mspfs.add(msd);
		}
		return mspfs;
	}
}