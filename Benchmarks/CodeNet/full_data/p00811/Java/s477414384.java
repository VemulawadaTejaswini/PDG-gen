import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> primes = Prime.primeList(100000);
		while(true) { 
			long m = sc.nextInt();
			if (m == 0) {
				break;
			}
			long a = sc.nextInt();
			long b = sc.nextInt();
			long sqrtM = (long) Math.sqrt(m);
			long ans = 0;
			long ansP = -1;
			long ansQ = -1;
			for(long p:primes) {
				if (p > sqrtM) {
					break;
				}
				long qMax = Math.min(m/p, b*p/a);
				int qInd = Collections.binarySearch(primes, (int) qMax);
				if (qInd < 0) {
					qInd = (~qInd) - 1;
				}
				if (qInd < 0) {
					continue;
				}
				long q = primes.get(qInd);
				if (q >= p && p*q > ans) {
					ans = p*q;
					ansP = p;
					ansQ = q;
				}
			}
			System.out.println(ansP + " " + ansQ);
		}
	}

}
class Prime {
	public static boolean[] isPrimeArray(int max) {
		boolean[] isPrime = new boolean[max+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for(int i=2;i*i<=max;i++) {
			if (isPrime[i]) {
				int j = i * 2;
				while(j<=max) {
					isPrime[j] = false;
					j += i;
				}
			}
		}
		return isPrime;
	}
	public static ArrayList<Integer> primeList(int max) {
		boolean[] isPrime = isPrimeArray(max);
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int i=2;i<=max;i++) {
			if (isPrime[i]) {
				primeList.add(i);
			}
		}
		return primeList;
	}
}