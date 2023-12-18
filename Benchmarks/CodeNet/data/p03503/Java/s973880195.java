import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int tenpo = sc.nextInt();
		ArrayList<ArrayList<Integer>> weekList = new ArrayList<>();
		ArrayList<Integer> uriageList = new ArrayList<>();
		for (int i = 0; i < tenpo; i++) {
			weekList.add(new ArrayList<Integer>());
			for (int w = 0; w < 10; w++) {
				weekList.get(i).add(sc.nextInt());
			}
		}

		for (int i = 0; i < tenpo; i++) {
			int totalUriage = 0;
			int uriage = sc.nextInt();
			for (int w = 0; w < 10; w++) {
				uriage = sc.nextInt();

				if (weekList.get(i).get(w).equals(new Integer(1))) {
					totalUriage += uriage;
				}
			}
			uriageList.add(totalUriage);
		}

		int max = Integer.MIN_VALUE;
		for (Integer i : uriageList) {
			if (max < i) {
				max = i;
			}
		}
		System.out.print(max);
	}
}