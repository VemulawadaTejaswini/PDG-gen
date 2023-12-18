import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int M = sc.nextInt();
		int N = sc.nextInt();

		ArrayList<Integer> data[] = new ArrayList[M];
		for (int i = 0; i < N; i++) {
			data[i] = new ArrayList();
		}

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			data[a - 1].add(b);
			data[b - 1].add(a);
			System.out.println("i=" + i);
		}

		int Q = sc.nextInt();
		int iro[] = new int[M];
		Arrays.fill(iro, 0);

		for (int i = 0; i < Q; i++) {
			int v = sc.nextInt();
			int d = sc.nextInt();
			int c = sc.nextInt();

			saiki(data, iro, v, d, c);
		}

		// 出力
		for (int i = 0; i < iro.length; i++) {
			System.out.println(iro[i]);
		}
	}

	public static void saiki(ArrayList<Integer> data[], int iro[], int v, int d, int c) {
		iro[v - 1] = c;
		for (int j = 0; j < data[v - 1].size(); j++) {
			int target = data[v - 1].get(j);
			iro[target - 1] = c;

			if (d != 1) {
				d -= 1;
				saiki(data, iro, target, d, c);
				d += 1;
			}
		}
	}
}