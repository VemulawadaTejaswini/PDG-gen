import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	static int N,K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Optional<Integer> min = list.stream().min((a, b) -> a.compareTo(b));
		
		for (int i = 0; i < N; i ++) {
			if (list.get(i) == min) {
				
			}
		}
	}
}
