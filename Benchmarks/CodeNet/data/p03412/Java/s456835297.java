import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();

		List<Long> aList = new ArrayList<Long>();
		List<Long> bList = new ArrayList<Long>();

		for (int i=0;i<n;i++) {
			aList.add(sc.nextLong());
		}
		for (int i=0;i<n;i++) {
			bList.add(sc.nextLong());
		}

		long [] bitSum = new long [32];
		for (int i=0;i<n;i++) {
			for (int j=0;j<32;j++) {
				bitSum[j] += ((aList.get(i) >> j) % 2)*n;
				bitSum[j] += ((bList.get(i) >> j) % 2)*n;
			}
		}


		for (int i=0;i<32;i++) {

			final int k = i;
			Comparator<Long> c = Comparator.comparing((Long x) -> x%(1L<<k));

			bList.sort(c);

			for (long a : aList) {
				if (a % (1L << i) != 0)
				bitSum[i] += n - firstBinarySearch(bList, (1L << (i+1)) - a %(1L << i), c);
			}
		}
		long ans = 0;

		for (int i=0;i<32;i++) {
			if (bitSum[i]%2 == 1) {
				ans += (1L<<i);
			}
		}

		System.out.println(ans);
	}

	static <T> int firstBinarySearch (List<? extends T> l, T v, Comparator<T> c) {
		//return the index of the first object larger than or equal to v
		//n if doesn't exist
		int n =l.size();
		int min = 0;
		int max = n-1;

		if (c.compare(l.get(n-1), v) < 0) {
			return n;
		}

		if (c.compare(l.get(0), v) >= 0) {
			return 0;
		}

		while (max > min + 1) {
			int mid = min+(max-min)/2;
			if (c.compare(l.get(mid), v)>= 0) {
				max = mid;
			} else {
				min = mid;
			}
		}

		return max;
	}

}

