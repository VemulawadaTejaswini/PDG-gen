import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		List<Integer> p = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			p.add(in.nextInt());
		}
		in.close();
		Collections.sort(p);
		int sum = 0;
		for (int i = 0; i + 1 < p.size(); ++i) {
			sum += p.get(i);
		}
		sum += p.get(p.size() - 1) / 2;
		System.out.println(sum);
	}

}