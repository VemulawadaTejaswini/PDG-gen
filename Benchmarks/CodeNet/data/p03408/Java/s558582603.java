import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		Map<String, Integer> blueWords = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			String word = in.nextLine();
			if (blueWords.containsKey(word)) {
				blueWords.put(word, blueWords.get(word) + 1);
			} else {
				blueWords.put(word, 1);
			}
		}
		int M = Integer.parseInt(in.nextLine());
		Map<String, Integer> redWords = new HashMap<>();
		for (int i = 0; i < M; ++i) {
			String word = in.nextLine();
			if (redWords.containsKey(word)) {
				redWords.put(word, redWords.get(word) + 1);
			} else {
				redWords.put(word, 1);
			}
		}
		in.close();
		Set<String> b = new HashSet<>();
		b.addAll(blueWords.keySet());
		b.removeAll(redWords.keySet());
		int maxVal = Integer.MIN_VALUE;
		for (String blueWord : blueWords.keySet()) {
			if (!redWords.containsKey(blueWord)) {
				maxVal = Math.max(maxVal, blueWords.get(blueWord));
			} else {
				maxVal = Math.max(maxVal, blueWords.get(blueWord) - redWords.get(blueWord));
			}
		}
		System.out.println(Math.max(maxVal, 0));
	}
}