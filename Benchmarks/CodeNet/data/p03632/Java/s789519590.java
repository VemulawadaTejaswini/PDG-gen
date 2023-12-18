import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int count;

		List<Integer> alist = new ArrayList<>();
		for (int i = 0; i <= B-A; i++) {
			alist.add(A + i);
		}

		List<Integer> blist = new ArrayList<>();
		for (int i = 0; i <= D-C; i++) {
			blist.add(C + i);
		}

		//スイッチを押している時間がかぶらない時
		if (B < C || D < A) {
			count = 0;
		//スイッチを押している時間がどちらかに含まれるとき
		} else if ((A < C && B > D) || (C < A && D > B)) {
			count = (B-A < D-C) ? B-A : D-C;

		//スイッチを押している時間が一部かぶるとき
		} else {
			count = Math.abs(C - B);
		}
		System.out.println(count);

	}

}