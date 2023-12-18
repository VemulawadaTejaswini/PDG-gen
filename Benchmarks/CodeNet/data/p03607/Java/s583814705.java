import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		HashMap<Integer, Integer> Ai = new HashMap<Integer, Integer>();
		for (int i=0; i<N; i++) {
			int a = sc.nextInt();
			if (Ai.containsKey(a)) {
				Integer val = Ai.get(a);
				val++;
				Ai.put(a, val);
			}
			else {
				Ai.put(a, 1);
			}
		}
		int cnt = 0;
		for (Map.Entry<Integer, Integer> entry : Ai.entrySet()) {
			if (entry.getValue() % 2 == 1 ) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}

}
