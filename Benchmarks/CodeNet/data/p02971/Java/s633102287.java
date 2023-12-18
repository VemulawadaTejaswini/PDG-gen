import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		Long[] aArray = new Long[a];

		for (int i = 0; i < a; i++) {
			aArray[i] = sc.nextLong();
		}

		List<Long> list = new ArrayList<Long>(Arrays.asList(aArray));
		Collections.sort(list,Comparator.reverseOrder());

		long max = list.get(0);
		long maxNext = list.get(1);

		for (int i = 0; i < a; i++) {
			if (max == aArray[i]) {
				System.out.println(maxNext);
			} else {
				System.out.println(max);
			}
		}
	}
}
