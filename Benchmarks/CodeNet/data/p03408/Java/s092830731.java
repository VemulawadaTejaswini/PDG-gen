import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		HashMap<String, Integer> cardMap = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String tmp = sc.next();
			if (!cardMap.containsKey(tmp)) {
				cardMap.put(tmp, 1);
			} else {
				int value = cardMap.get(tmp);
				cardMap.put(tmp, ++value);
			}
		}

		int M = sc.nextInt();
		for(int i =0;i<M;i++) {
			String key = sc.next();
			if(cardMap.containsKey(key)) {
				int value = cardMap.get(key);
				cardMap.put(key, --value);
			}
		}
		int Max = 0;
		for(String key:cardMap.keySet()) {
			Max = Math.max(Max, cardMap.get(key));
		}
		System.out.println(Max);

	}
}
