
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Long, Integer> shop = new TreeMap<>();
		for(int i = 0; i < N; i++) {
			shop.put(sc.nextLong(), sc.nextInt());
		}
		long sum = 0;
		for(Map.Entry<Long, Integer> entry : shop.entrySet()) {
			long A = entry.getKey();
			int B = entry.getValue();
			if(B <= M) {
				sum += A * B;
				M -= B;
			} else {
				sum += A * M;
				break;
			}
		}
		System.out.println(sum);
	}

}
