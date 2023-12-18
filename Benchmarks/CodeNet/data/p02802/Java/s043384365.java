import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		String[][] array = new String[N][M];
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>() {
			{
				for (int i = 0; i < N; i++) {
					add(new ArrayList<String>());
				}
			}
		};
		int[] p = new int[M];
		String[] S = new String[M];
		for (int i = 0; i < M; i++) {
			list.get(in.nextInt() - 1).add(in.next());
		}
		int ans = 0;
		int penalty = 0;
		for (int i = 0; i < N; i++) {
			int tmpPenalty = 0;
			int correct = 0;
			for (int j = 0; j < list.get(i).size(); j++) {
				if (list.get(i).get(j).equals("WA")) {
					tmpPenalty++;
				}
				if (list.get(i).get(j).equals("AC")) {
					correct++;
					break;
				}
			}
			if (correct == 1) {
				ans++;
				penalty += tmpPenalty;
			}
		}
		System.out.println(ans + " " + penalty);
		in.close();
	}
}