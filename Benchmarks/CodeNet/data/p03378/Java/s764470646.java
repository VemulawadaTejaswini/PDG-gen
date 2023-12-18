import java.util.*;

public class Main {
	int N, M, X;
	List<Integer> A = new ArrayList<>();
	int result;

	private Main(Scanner in) {
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		X = Integer.parseInt(tokens[2]);
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < M; ++i) {
			A.add(Integer.parseInt(tokens[i]));
		}
	}

	private void calc() {
		Integer[] rightGates = A.stream().filter(x -> x > X).toArray(Integer[]::new);
		Integer[] leftGates = A.stream().filter(x -> x < X).toArray(Integer[]::new);
		result = Math.min(rightGates.length, leftGates.length);
	}

	private void show() {
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main ins = new Main(in);
		ins.calc();
		ins.show();
		in.close();

	}

}