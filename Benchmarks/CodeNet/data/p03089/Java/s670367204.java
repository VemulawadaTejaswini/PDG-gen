import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		List<Integer> bList = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			int b = sc.nextInt();
			if (b > i + 1) {
				System.out.println(-1);
				return;
			}
			bList.add(b);
		}

		List<Integer> aList = new ArrayList<Integer>();


		for (int j = 0; j < N; j++) {
			int i;
			boolean find = false;
			int bLastIndex = bList.size()-1;
			for (i = 0; i < bLastIndex; i++) {
				if (bList.get(i) >= bList.get(i + 1)) {
					find = true;
					break;
				}
			}
			if (find) {
				aList.add(bList.get(i));
				bList.remove(i);
			} else {
				aList.add(bList.get(bLastIndex));
				bList.remove(bLastIndex);
			}
		}

		Collections.reverse(aList);
		aList.forEach(a -> System.out.println(a));

	}


}