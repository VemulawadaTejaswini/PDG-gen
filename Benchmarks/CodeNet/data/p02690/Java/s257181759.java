import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		List<Long> list = new ArrayList<>();
		long tmp = 0l;
		long count = 0l;
		while (tmp < x * 10l) {
			tmp = (long) Math.pow(count++, 5);
			list.add(tmp);
		}
		long a = 0l;
		long b = 0l;
		for (int i = list.size() - 1; i >= 0; i--) {
			for (int j = list.size() - 1; j >= 0; j--) {
				long a1 = list.get(i);
				long b1 = list.get(j);
				if (a1 > b1) {
					b1 *= -1l;
				}
				long calc = a1 - b1;
				if (calc == x) {
					a = i;
					b = j;
					if (b1 < 0l) {
						b *= -1l;
					}
					break;
				}
			}
		}
		System.out.println(a + " " + b);
	}
}
