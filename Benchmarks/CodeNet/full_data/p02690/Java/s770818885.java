import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int tmp = 0;
		int count = 0;
		while (tmp < x * 5) {
			tmp = (int) Math.pow(count++, 5);
			list.add(tmp);
		}
		int a = 0;
		int b = 0;
		for (int i = list.size() - 1; i >= 0; i--) {
			for (int j = list.size() - 1; j >= 0; j--) {
				int a1 = list.get(i);
				int b1 = list.get(j);
				if (a1 > b1) {
					b1 *= -1;
				}
				int calc = a1 - b1;
				if (calc == x) {
					a = i;
					b = j;
					if (b1 < 0) {
						b *= -1;
					}
					break;
				}
			}
		}
		System.out.println(a + " " + b);
	}
}
