import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		List<Long> list = new ArrayList<>();
		long tmp = 0l;
		long count = 0l;
		while (tmp < (long) 1e16 * 20l) {
			tmp = (long) Math.pow(count++, 5);
			list.add(tmp);
		}
		long a = Long.MIN_VALUE;
		long b = 0l;
		boolean end = false;
		for (int i = 0; i < list.size() && !end; ++i) {
			for (int j = 0; j < list.size(); ++j) {
				long a1 = list.get(i);
				long b1 = list.get(j);
				long calc = a1 - b1;
				if (calc == x) {
					a = i;
					b = j;
					if (b1 < 0l) {
						b *= -1l;
					}
					end = true;
					break;
				}
			}
		}
		if (a < (long) 1e16) {
			for (int i = 0; i < list.size() && !end; ++i) {
				for (int j = 0; j < list.size(); ++j) {
					long a1 = list.get(i);
					long b1 = list.get(j);
					b *= -1l;
					long calc = a1 - b1;
					if (calc == x) {
						a = i;
						b = j;
						if (b1 < 0l) {
							b *= -1l;
						}
						end = true;
						break;
					}
				}
			}
		}
		if (a < (long) 1e16) {
			for (int i = 0; i < list.size() && !end; ++i) {
				for (int j = 0; j < list.size(); ++j) {
					long a1 = list.get(i);
					long b1 = list.get(j);
					b *= -1l;
					a *= -1l;
					long calc = a1 - b1;
					if (calc == x) {
						a = i;
						b = j;
						if (b1 < 0l) {
							b *= -1l;
						}
						if (a1 < 0l) {
							a *= -1l;
						}
						end = true;
						break;
					}
				}
			}
		}
		System.out.println(a + " " + b);
	}
}
