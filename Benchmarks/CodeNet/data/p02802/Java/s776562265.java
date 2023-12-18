import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		FastScanner fScanner = new FastScanner();
		int N = fScanner.nextInt();
		int M = fScanner.nextInt();
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>() {
			{
				for (int i = 0; i < N; i++) {
					add(new ArrayList<String>());
				}
			}
		};
		for (int i = 0; i < M; i++) {
			int index = Integer.parseInt(fScanner.next()) - 1;
			list.get(index).add(fScanner.next());
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
	}
}