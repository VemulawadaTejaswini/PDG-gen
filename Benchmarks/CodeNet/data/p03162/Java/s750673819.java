import java.util.*;

public class Main {
	int N;
	List<Integer> a, b, c;
	long[][] happies;
	int nextPlay;

	Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		a = new ArrayList<>(N);
		b = new ArrayList<>(N);
		c = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.nextLine().split(" ");
			a.add(Integer.parseInt(tokens[0]));
			b.add(Integer.parseInt(tokens[1]));
			c.add(Integer.parseInt(tokens[2]));
		}
		in.close();
		happies = new long[N][3];
		happies[0][0] = a.get(0);
		happies[0][1] = b.get(0);
		happies[0][2] = c.get(0);
	}

	long getResult() {
		return Math.max(happies[N - 1][0], Math.max(happies[N - 1][1], happies[N - 1][2]));
	}

	void calc() {
		for (int i = 1; i < N; ++i) {
			happies[i][0] = Math.max(happies[i - 1][1], happies[i - 1][2]) + a.get(i);
			happies[i][1] = Math.max(happies[i - 1][0], happies[i - 1][2]) + b.get(i);
			happies[i][2] = Math.max(happies[i - 1][0], happies[i - 1][1]) + c.get(i);
		}
	}

	public static void main(String[] args) {
		Main ins0 = new Main();
		ins0.calc();
		System.out.println(ins0.getResult());
	}

}