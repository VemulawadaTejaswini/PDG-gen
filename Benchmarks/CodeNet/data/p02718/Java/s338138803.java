import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);
		int sum = 0;

		String[] tp  = scanner.nextLine().split(" ");
		List<Integer> list  = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {

			int now = Integer.parseInt(tp[i]);

			list.add(now);

			sum += now;
		}

		double cl = sum / (4.0 * m);

		int ans = (int) list.stream()
					.filter(s -> s >= cl)
					.count();

		if(ans >= m)System.out.println("Yes");
		else System.out.println("No");

	}
}