import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextInt();
		ArrayList<Long> n = new ArrayList<>();
		ArrayList<Long> p = new ArrayList<>();
		for (long i = 0; i < N; i++) {
			n.add(i + 1);
			p.add(i + 1);
		}
		long tmp = p.get(0);
		p.remove(0);
		p.add(tmp);
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += n.get(i) % p.get(i);
		}
		System.out.println(ans);
		in.close();
	}
}