import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static String joinInt(int[] a, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(separator);
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}

	static int[] nextIntArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}

	public static boolean[] sieve(int n) {
		boolean[] array = new boolean[n + 2];
		Arrays.fill(array, true);
		array[0] = false;
		array[1] = false;
		for (int i = 2; i*i < array.length; i++) {
			if (!array[i]) continue;
			for (int j = i*i; j < array.length; j += i) {
				array[j] = false;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long gcd = gcd(A, B);
		// System.out.println("gcd =  "+ gcd);
		int max = (int)Math.sqrt((double)gcd) + 1;
		boolean[] sieve = sieve(max);
		// int cnt = 1;
		// System.out.println("sqrt =  "+ sqrt);

		int cnt = 1;
		{
			long i;
			for (i = 2; i * i <= gcd; i++) {
				if (i < sieve.length && sieve[(int)i] == false) continue; // 素数でない
				if (gcd % i == 0) {
					gcd /= i;
					cnt++;
					while (gcd % i == 0) gcd /= i;
				}
			}
			if (cnt > 1) {
				for (; i <= gcd; i++) {
					if (i < sieve.length && sieve[(int)i] == false) continue; // 素数でない
					if (gcd % i == 0) {
						gcd /= i;
						cnt++;
						while (gcd % i == 0) gcd /= i;
					}
				}	
			}
		}

		System.out.println(cnt);
	}
}
