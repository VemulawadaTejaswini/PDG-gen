

import java.util.*;

public class Main {
	private static long MAX = Long.MAX_VALUE;
	private static List<Abcd> getStrings(Scanner sc, int num) {
		List<Abcd> stringList = new ArrayList<>();
		while(num>0) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			stringList.add(new Abcd(n,a,b,c,d));
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Abcd> array = getStrings(sc, t);
		for (int i = 0; i < t; i++) {

			Abcd abcd = array.get(i);
			Map<Long, Long> num = new HashMap<>();
			Map<Long, Boolean> numB = new HashMap<>();
			num.put(1L, abcd.d);
			calc(num, abcd.n, abcd, numB);
			System.out.println(num.get(abcd.n));

//			for (int j = 1; j <= abcd.n+4; j++) {
//				System.out.print(j + ": " +  num[j] + ", ");
//			}
//			System.out.println();
		}
	}

	private static long calc(Map<Long, Long> num, long n, Abcd abcd, Map<Long, Boolean> numB) {
		if (num.containsKey(n)) {
			return num.get(n);
		}
		boolean isbeishu = false;
		long n1 = MAX;
		long n2 = MAX;
		long n3 = MAX;
		long n4 = MAX;
		long n5 = MAX;
		if (n % 5 == 0) {
			numB.put(n/5, true);
			long temp = calc(num, n/5, abcd, numB);
			if (isMax(temp)) {
				n3 = MAX;
			} else {
				n3 = temp + abcd.c;
			}
		}
		if (n % 3 == 0) {
			numB.put(n/3, true);
			long temp = calc(num, n/3, abcd, numB);
			if (isMax(temp)) {
				n4 = MAX;
			} else {
				n4 = temp + abcd.b;
			}
		}
		if (n % 2 == 0) {
			numB.put(n/2, true);
			long temp = calc(num, n/2, abcd, numB);
			if (isMax(temp)) {
				n5 = MAX;
			} else {
				n5 = temp + abcd.a;
			}
		}
		if (n <= abcd.n + 5 & n >= abcd.n) {
			long temp = calc(num, n + 1, abcd, numB);
			if (isMax(temp)) {
				n1 = MAX;
			} else {
				n1 = temp + abcd.d;
			}
		} else {
			if (numB.containsKey(n) && numB.get(n)) {
				long temp = calc(num, n + 1, abcd, numB);
				if (isMax(temp)) {
					n1 = MAX;
				} else {
					n1 = temp + abcd.d;
				}
			}
		}
		if (n >= abcd.n - 5 & n <= abcd.n) {
			long temp = calc(num, n - 1, abcd, numB);
			if (isMax(temp)) {
				n2 = MAX;
			} else {
				n2 = temp + abcd.d;
			}
		} else {
			if (numB.containsKey(n) && numB.get(n)) {
				long temp = calc(num, n - 1, abcd, numB);
				if (isMax(temp)) {
					n2 = MAX;
				} else {
					n2 = temp + abcd.d;
				}
			}
		}


		long min = Math.min(Math.min(Math.min(n1, n2), Math.min(n3, n4)), n5);
		num.put(n, min);
		return min;

	}

	private static boolean isMax(long num) {
		return num == MAX;
	}



}


 class Abcd  {
		long n;
		long a;
		long b;
		long c;
		long d;

		public Abcd(long n, long a, long b, long c, long d) {
				this.n = n;
				this.a = a;
				this.b = b;
				this.c = c;
				this.d = d;
		}
}
