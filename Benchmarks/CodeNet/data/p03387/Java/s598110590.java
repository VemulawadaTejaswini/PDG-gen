import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> abcList = new ArrayList<Integer>();
		abcList.add(sc.nextInt());
		abcList.add(sc.nextInt());
		abcList.add(sc.nextInt());

		Collections.sort(abcList);

		int S = 0;
		for (Integer i : abcList) {
			S += i;
		}
		int M = abcList.get(abcList.size() - 1 );
		int C = 0;
		while (true) {
			if (S == (3 * M)) {
				break;
			}
			if ((S % 2) != ((3 * M) % 2)) {
				M ++;
			}
			S += 2;
			C++;
		}
		System.out.println(C);
	}

}
