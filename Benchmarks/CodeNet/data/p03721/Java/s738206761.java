
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		int sum = 0;
		int i = 0, j = 0;
		LinkedList ans = new LinkedList();
		int n = 0, k = 0;
		n = sc.nextInt();
		k = sc.nextInt();

		for (i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum += b;

			for (j = 0; j < sum; j++)
				ans.add(a);
		}
		Collections.sort(ans);
		System.out.println(ans.get(k));
	}

}