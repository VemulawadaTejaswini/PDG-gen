import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> abs = new ArrayList<Integer>();
		ArrayList<Integer> gcdnum = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			array.add(sc.nextInt());
		}

		abs.add(Math.abs(d - array.get(0)));

		for(int i = 0 ; i < n - 1; i++) {
			abs.add(Math.abs(array.get(i + 1) - array.get(i)));
		}

		for(int i = 0 ; i < n - 1; i++) {
			gcdnum.add((int)gcd(abs.get(i + 1), abs.get(i)));
		}

		Collections.sort(gcdnum);
		Collections.reverse(gcdnum);
		System.out.println(gcdnum.get(gcdnum.size()-1));
	}

	public static long gcd(long m, long n) {
		if(m < n)
			return gcd(n, m);
		if(n == 0)
			return m;
		return gcd(n, m % n);

	}

}
