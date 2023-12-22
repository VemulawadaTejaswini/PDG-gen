import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static ArrayList<Integer> prime = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {
		prime.add(6);
		for (int base = 7; base < 300010; base += 7) {
			if (isPrime(base + 1)) prime.add(base + 1);
			if (isPrime(base + 6)) prime.add(base + 6);
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 1) break;
			System.out.print(N + ":");
			for (int i = 0; prime.get(i) <= N; ++i) {
				if (N % prime.get(i) == 0) System.out.print(" " + prime.get(i));
			}
			System.out.println();
		}
	}

	static boolean isPrime(int n) {
		for (int p : prime) {
			if (n % p == 0) return false;
			if (p * p >= n) break;
		}
		return true;
	}

}