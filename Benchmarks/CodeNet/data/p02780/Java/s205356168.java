import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, k;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		ArrayList<Double> list = new ArrayList<Double>();
		for(int i = 0; i < n; i++) {
			Integer p = scan.nextInt();
			list.add(culcExpectedValue(p));
		}
		Double maxExpectedValue = 0.0;
		for(int i = 0; i < n - k + 1; i++) {
			Double expected = 0.0;
			for(int j = 0; j < k; j++) {
				expected += list.get(i+j);
			}
			if(maxExpectedValue < expected) maxExpectedValue = expected;
		}

		System.out.println(String.format("%.12f", maxExpectedValue));
		scan.close();
	}

	public static Double culcExpectedValue(int p) {
		Double ret = 0.0;
		for(int i=1;i<=p;i++) {
			ret += ((double) i) / ((double) p);
		}
		return ret;
	}

}
