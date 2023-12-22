import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new BufferedReader(new FileReader("/workspace/AOJ/src/section1/in38.txt")));

		int n = sc.nextInt();
		int[] r = new int[n];
		for (int t = 0; t < n; t++) {
			r[t] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int ans = Integer.MIN_VALUE;


		for (int i = 0; i < n; i++) {
			// 最小値を求める
			if (min > r[i]) {
				min = r[i];
			}
			ans = Math.max(ans, r[i] - min);
		}
		System.out.println(ans);
	}
}

