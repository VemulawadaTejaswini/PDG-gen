
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		Map<Integer, Integer> train = new HashMap<>();
		for(int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			train.put(l, r);
		}
		for(int i = 0; i < q; i++) {
			int count = 0;
			int l = sc.nextInt();
			int r = sc.nextInt();
			for(Map.Entry<Integer, Integer> e : train.entrySet()) {
				if(l <= e.getKey() && e.getValue() <= r) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
