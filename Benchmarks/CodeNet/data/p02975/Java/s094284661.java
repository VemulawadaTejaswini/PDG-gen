import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Grand Contest 035
//A	XOR Circle
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		List<Integer> aList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			aList.add(sc.nextInt());
		}
		sc.close();

		String ans = "Yes";

		for (int i = 0; i < aList.size(); i++) {
			int a = aList.get(i);
			int aPre;
			if (i == 0) {
				aPre = aList.get(N - 1);
			} else {
				aPre = aList.get(i - 1);
			}
			int aNext;
			if (i == N - 1) {
				aNext = aList.get(0);
			} else {
				aNext = aList.get(i + 1);
			}

			int xor = aPre ^ aNext;
			if (xor != a) {
				System.out.println("No");
				return;
			}

		}
		System.out.println(ans);
	}
}
