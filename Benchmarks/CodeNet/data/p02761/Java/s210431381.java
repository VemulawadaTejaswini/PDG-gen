import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n == 1) {
			System.out.println(0);
			System.exit(0);
		}
		int[] seisu = new int[n];
		Map<Integer, Integer> sici = new HashMap<>();
		for(int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(sici.containsKey(s)) {
				if(sici.get(s) != c) {
					System.out.println(-1);
					System.exit(0);
				}
			}
			sici.put(s, c);
			seisu[s - 1] = c;
		}

		if(!sici.containsKey(1)) {
			seisu[0] = 1;
		}

		if(n != 1 && seisu[0] == 0) {
			System.out.println(-1);
			System.exit(0);
		}

		for(int value : seisu) {
			System.out.print(value);
		}

		sc.close();
	}
}