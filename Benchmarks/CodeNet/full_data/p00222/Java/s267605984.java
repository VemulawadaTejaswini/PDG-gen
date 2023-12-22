import java.util.*;

class Main {
	
	public static boolean BinarySearch (ArrayList<Integer> list, int p) {
		
		int low = 0;
		int high = list.size() - 1;
		int middle = (low + high) / 2;
		
		while (low <= high) {
			if (list.get(middle) == p) {
				return true;
			} else if (list.get(middle) < p) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
			middle = (low + high) / 2;
		}
		
		return false;
		
	}
	
	public static ArrayList<Integer> sieve (int n) {
		
		ArrayList<Integer> ret = new ArrayList<Integer>();
		boolean[] isPrime = new boolean[n + 1];
		
		Arrays.fill(isPrime, true);
		
		for (int i = 4; i <= n; i += 2)
			isPrime[i] = false;
		
		for (int i = 3; i * i <= n; i += 2) {
			for (int j = 3; i * j < n; j += 2)
				isPrime[i * j] = false;
		}
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) ret.add(i);
		}
		return ret;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {		
			int num = sc.nextInt();
			if (num == 0) break;
			ArrayList<Integer> primes = sieve(num);
			for (int i = primes.size() - 1; i >= 0; i--) {
				int p4 = primes.get(i);
				if (primes.get(i - 1) == p4 - 2 && primes.get(i - 2) == p4 - 6 && primes.get(i - 3) == p4 - 8) {
					System.out.println(p4);
					break;
				}
			}
		}
		
	}
	
}