import java.util.ArrayList;
import java.util.Scanner;

public class Main { // https://atcoder.jp/contests/abc096/tasks/abc096_d
	static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	static boolean isPrime(int x) {
		if (x == 2 || x == 3) return true;
		if (x < 2) return false;
		
		for (int i = 2; i * i <= 2 * x; i++) {
			if (x % i == 0) return false;
		}
		return true;
	}
	
	static void init(int psize, int modd) {
		int cur = modd;
		while (primes.size() < psize) {
			if (isPrime(cur)) primes.add(cur);
			
			cur += 5;
		}
	}
	
	public static void main(String[] args) { 
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		long start = System.nanoTime();
		init(n, 2); // SIKE its actually 2 mod 5 you just got trolled
	//	System.out.println((System.nanoTime() - start) / 1000000);
		
		for (int i : primes) System.out.print(i + " ");
	}
}
