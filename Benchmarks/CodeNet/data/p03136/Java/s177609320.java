import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();									// N角形
		List<Integer> lengthList = new ArrayList<>(); 			// 辺の長さを入れる配列

		/* データ入力 */
		for (int i = 0; i < N ; i++) {
			lengthList.add(scan.nextInt());
		}

		int sum = lengthList.stream().mapToInt(i -> i).sum();
		int max = Collections.max(lengthList);

		System.out.println(max < sum - max ? "Yes" : "No");
		scan.close();
	}

}