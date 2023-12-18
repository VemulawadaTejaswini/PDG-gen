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
		for (int i = 0; i < M; i++) {
			data[i] = new ArrayList();
		}

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			data[a - 1].add(b);
			data[b - 1].add(a);
		}

		int Q = sc.nextInt();
		int hairetsu[][] = new int[Q][3];
		for (int i = 0; i < Q; i++) {
			hairetsu[i][0] = sc.nextInt();
			hairetsu[i][1] = sc.nextInt();
			hairetsu[i][2] = sc.nextInt();
		}

		int iro[] = new int[M];
		Arrays.fill(iro, 0);

		for (int i = Q - 1; i >= 0; i--) {
			ArrayList<Integer> sumi = new ArrayList<>();
			int v = hairetsu[i][0];
			int d = hairetsu[i][1];
			int c = hairetsu[i][2];

			saiki(data, iro, v, d, c, sumi);

			boolean chk = true;
			for (int j = 0; j < M; j++) {
				if (iro[j] == 0) {
					chk = false;
					break;
				}
			}
			if (chk == true) {
				break;
			}
		}

		// 出力
		for (int i = 0; i < iro.length; i++) {
			System.out.println(iro[i]);
		}
	}

	public static void saiki(ArrayList<Integer> data[], int iro[], int v, int d, int c, ArrayList<Integer> sumi) {
		if (iro[v - 1] == 0) {
			iro[v - 1] = c;
		}
		sumi.add(v);
		for (int j = 0; j < data[v - 1].size(); j++) {
			int target = data[v - 1].get(j);
			if (sumi.indexOf(target) != -1) {
				continue;
			}

			if (iro[target - 1] == 0) {
				iro[target - 1] = c;
				sumi.add(target);
			}

			if (d != 1) {
				d -= 1;
				saiki(data, iro, target, d, c, sumi);
				d += 1;
			}
		}
	}
}