import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[][] graph = new boolean[N + 1][];
		for (int j = 1; j <= N; j++) {
			graph[j] = new boolean[N + 1];
		}
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = true;
			graph[b][a] = true;
		}
		if (judge(N, graph)) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}
	}

	private boolean judge(int N, boolean[][] graph) {
		if (N % 2 == 1) {
			return true;
		}
		int[] leafCloseCount = new int[N + 1];
		for (int a = 1; a <= N; a++) {
			int count = 0;
			int lastNode = 0;
			for (int b = 1; b <= N; b++) {
				if (graph[a][b]) {
					count++;
					lastNode = b;
				}
			}
			if (count == 1) {
				leafCloseCount[lastNode]++;
			}
		}
		for (int count : leafCloseCount) {
			if (count > 1) {
				return true;
			}
		}
		return false;
	}
}