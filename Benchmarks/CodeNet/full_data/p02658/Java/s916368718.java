import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		List<String> l = Arrays.asList(sc.nextLine().split(" "));
		double ans = 1;
		for (int i = 0; i < l.size(); i++) {
			double num = Integer.parseInt(l.get(i));
			ans = ans * num;
		}
		double chk = Math.pow(10, 18);
		if (ans > chk) {
			System.out.print("-1");
		}
		System.out.print(ans);
	}
}
