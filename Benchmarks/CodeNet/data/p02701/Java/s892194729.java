
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ans = 0;
		HashMap<String, Integer> goods = new HashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			String S = scan.next();
			if(goods.containsKey(S)) {
				continue;
			}else {
				ans++;
				goods.put(S, 1);
			}
		}

		System.out.println(ans);
		scan.close();
	}
}
