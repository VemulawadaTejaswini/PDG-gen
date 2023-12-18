import java.util.Scanner;

public class Main {
	private static int[] encode = {0, 1, 2, 3, 5, 7, 11, 13, 17};
	private static int[] decode = {0, 1, 2, 3, 0, 4, 0, 5, 0, 0, 0, 6, 0, 7, 0, 0, 0, 8};
	private static int[][] graph = new int[9][9];
	private static int goal = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] conf = scanner.nextLine().split(" ");
		int numNodes = Integer.parseInt(conf[0]);
		int numEdges = Integer.parseInt(conf[1]);

		for (int i = 1; i <= numNodes; i++) goal *= encode[i];
		for (int i = 0; i < numEdges; i++) {
			String[] input = scanner.nextLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			graph[start][end] = 1;
			graph[end][start] = 1;
		}

		System.out.println(numPaths(1, 1));
	}

	private static int numPaths(int current, int passed) {
		if (passed == goal) return 1;

		int numPaths = 0;
		for (int dest = 1; dest <= 8; dest++) {
			if (graph[current][dest] == 1 && passed % encode[dest] != 0) {
				numPaths += numPaths(dest, passed * encode[dest]);
			}
		}
		return numPaths;
	}
}
