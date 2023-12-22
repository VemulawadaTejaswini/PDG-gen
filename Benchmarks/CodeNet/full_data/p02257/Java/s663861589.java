
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = sc.nextInt();
		List<Integer> as = new LinkedList<>();
		for (int i = 2; i < min+N; i++) {
			boolean flg = true;
			for (int j = 0; j < as.size(); j++) {
				if (i % as.get(j) == 0) {
					flg = false;
					break;
				}
			}
			if (flg) {
				as.add(i);
			}
		}
		System.out.println(as.stream().filter(i -> i >= min).count());
	}
}