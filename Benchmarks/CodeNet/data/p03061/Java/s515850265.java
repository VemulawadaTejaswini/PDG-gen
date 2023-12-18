import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Long> aList = new ArrayList<>();
		
		List<Long> gcdList = new ArrayList<>();

		int countOne = 0;
		int countTwo = 0;

		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			aList.add(a);
		}

		long prevGcd = aList.get(0);
		for (int i = 0; i < n; i++) {
			long a = aList.get(i);
			prevGcd = gcd(a, prevGcd);
			gcdList.add(prevGcd);
		}
		// System.out.println("gcdList "+gcdList);

		long tmpGcd=gcdList.get(n-2);
		long rightGcd = aList.get(n-1);
		long maxResult = tmpGcd;
		// System.out.println("maxResult "+maxResult);
		// System.out.println(" ");

		for (int i = n-2; i >=1; i--) {
			long curGcd;
			long leftGcd = gcdList.get(i-1);
			rightGcd = gcd(rightGcd, aList.get(i+1));
			curGcd = gcd(leftGcd,rightGcd);
			maxResult = Math.max(maxResult, curGcd);
			
			// System.out.println("aList.get(i) "+aList.get(i+1));
			// System.out.println("leftGcd "+leftGcd);
			// System.out.println("rightGcd "+rightGcd);
			// System.out.println("curGcd "+curGcd);
			// System.out.println("maxResult "+maxResult);
			// System.out.println(" ");
		}

		// i=0が仲間はずれのパターンだけ
		rightGcd = gcd(rightGcd, aList.get(1));
		maxResult = Math.max(maxResult, rightGcd);
		// System.out.println("aList.get(1) "+aList.get(1));
		// System.out.println("rightGcd "+rightGcd);
		// System.out.println("maxResult "+maxResult);

		System.out.println(maxResult);


	}

	private static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}
