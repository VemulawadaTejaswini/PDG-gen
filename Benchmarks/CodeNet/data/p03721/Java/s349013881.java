import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		List<BigAry> list = new ArrayList<BigAry>();
		for (long i = 0; i < N; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			BigAry ary = new BigAry(a, b);
			list.add(ary);
		}
		list.sort((a, b) -> (int) a.value - (int) b.value);
		long sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).num;
			if (sum >= K) {
				System.out.println(list.get(i).value);
				return;
			}
		}
	}

	public static class BigAry {
		private long value;
		private long num;

		public BigAry(long value, long num) {
			this.value = value;
			this.num = num;
		}
	}

}