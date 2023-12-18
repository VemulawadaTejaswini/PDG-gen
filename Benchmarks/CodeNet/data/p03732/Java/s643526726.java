import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {

		class Good implements Comparable<Good>{
			long value;
			long weight;

			public Good(long val, long w) {
				value = val;
				weight = w;
			}

			public long getValue() {
				return value;
			}

			public long getWeight() {
				return weight;
			}

			public int compareTo(Good other) {
				long gap = value - weight;
				long otherGap = other.weight - other.weight;
				if (gap > otherGap) {
					return 1;
				} else if (gap == otherGap) {
					if (value > other.value) {
						return 1;
					} else if (value < other.value) {
						return -1;
					}
					return 0;
				}
				return -1;
			}

		}

		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		long W = reader.nextLong();
		long ans = 0;
		ArrayList<Good> list = new ArrayList<Good>();
		for (int i = 0; i < N; i++) {
			long wei = reader.nextLong();
			long val = reader.nextLong();
			Good good = new Good(val, wei);
			list.add(good);
		}
		Collections.sort(list);

		for (int i = N-1; i >= 0; i--) {
			Good item = list.get(i);
			long tmp = 0;
			long remain = W-item.getWeight();
			if (remain >= 0) {
				tmp = item.getValue();
				for (int j = i-1; j >= 0; j--) {
					Good next = list.get(j);
					if (remain >= 0) {
						if (next.getWeight() <= remain) {
							tmp += next.getValue();
							remain -= next.getWeight();
						}
					} else {
						break;
					}
				}
			}
			ans = Math.max(ans, tmp);

		}

		System.out.println(ans);
		reader.close();

	}

}
