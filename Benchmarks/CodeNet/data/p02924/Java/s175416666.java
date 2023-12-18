import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		ArrayList<Long> n = new ArrayList<>();
		ArrayList<Long> p = new ArrayList<>();
		for (long i = 0; i < N; i++) {
			n.add(i + 1);
			if (i != 0) {
				p.add(i + 1);
			}
		}
		p.add(n.get(0));
		long ans = 0;
		for (int i = 0; i < N - 1; i++) {
			ans += n.get(i);
		}
		System.out.println(ans);
		in.close();
	}
}