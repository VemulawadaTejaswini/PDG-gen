
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int N = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		
		Collections.sort(list);
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		int sum1 = 0;
		int sum2 = 0;
		
		if (N % 2 == 0) {
			for (int i = 0; i < N / 2; i++) {
				list2.add(list.get(i));
				list3.add(list.get(N - 1 - i));
			}
			
			
		} else {
			int indexHalf = scan.nextInt() + 1;
			int margin1 = list.get(indexHalf) - list.get(indexHalf - 1);
			int margin2 = list.get(indexHalf) - list.get(indexHalf + 1);
			
			if (margin1 >= margin2) {
				for (int i = 0; i < indexHalf; i++) {
					list2.add(list.get(i));
				}
				for (int i = 0; i < indexHalf - 1; i++) {
					list3.add(list.get(N - i));
				}
			} else {
				for (int i = 0; i < indexHalf - 1; i++) {
					list2.add(list.get(i));
				}
				for (int i = 0; i < indexHalf; i++) {
					list3.add(list.get(N - i));
				}
			}
		}
		for (Integer integer : list2) {
			sum1 += integer;
		}
		for (Integer integer : list3) {
			sum2 += integer;
		}
		
		System.out.println(Math.abs(sum1 - sum2));
		
	}
}