import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		ArrayList<Integer> ary = new ArrayList<Integer>();

		int sum1 = P + Q;
		int sum2 = R + Q;
		int sum3 = P + R;
		int sum4 = Q + R;
		int sum5 = R + P;
		int sum6 = Q + P;

		ary.add(sum1);
		ary.add(sum2);
		ary.add(sum3);
		ary.add(sum4);
		ary.add(sum5);
		ary.add(sum6);

		Collections.sort(ary);

		System.out.println(ary.get(0));

		sc.close();
	}
}