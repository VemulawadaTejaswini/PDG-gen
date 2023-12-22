import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int M = input.nextInt();
		int X = input.nextInt();

		int[] master = new int[M + 1];

		int[][] bookList = new int[N][];

		Map<Integer, Integer> costList = new TreeMap<>();

		for(int i = 0; i < N; i++) {
			int[] bookInfo = new int[M + 1];

			for(int m =0 ; m < M + 1; m++) {

				int C = input.nextInt();

				if(m == 0) {

					costList.put(C, i);

				}
				bookInfo[m] = C;

			}

			bookList[i] = bookInfo;
		}
		input.close();

		int count = 0;

		for(int nkey : costList.keySet()) {

			System.out.println(Arrays.toString(master));

			int i = costList.get(nkey);


			int[] List = bookList[i];
			count = 0;

			for(int n = 0; n < M + 1; n++) {

				master[n] = master[n] + List[n];

				if(n != 0 & X > master[n]) {

					count++;

					}
			}
			if (count == 0) {

				break;

			}

		}

		if(count > 0) {

			System.out.println(-1);

		}else {

			System.out.println(master[0]);

		}

	}
}
