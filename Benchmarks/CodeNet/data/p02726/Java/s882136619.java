import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int graphLength = sc.nextInt();
			int graphStart = sc.nextInt();
			int graphEnd = sc.nextInt();
			int[][] graph = new int[graphLength][graphLength];
			for (int i = 0; i < graphLength - 1; i++) {
				graph[i][i + 1] = 1;
			}
			graph[graphStart - 1][graphEnd - 1] = 1;
			for (int count = 0; count < graphLength; count++) {

				for (int i = 0; i < graphLength; i++) {
					for (int k = i+1; k < graphLength; k++) {
						int tmp = 1000;
						if (i != 0) {
							tmp = graph[i - 1][k] != 0 ? Math.min(graph[i - 1][k], tmp) : tmp;
						}
						if (i != graphLength - 1) {
							tmp = graph[i + 1][k] != 0 ? Math.min(graph[i + 1][k], tmp) : tmp;
						}
						if (k != i) {
							tmp = graph[i][k - 1] != 0 ? Math.min(graph[i][k - 1], tmp) : tmp;
						}
						if (k != graphLength - 1) {
							tmp = graph[i][k + 1] != 0 ? Math.min(graph[i][k+1], tmp) : tmp;
						}
						if (tmp != 1000) {
							graph[i][k] = Math.min(graph[i][k] != 0 ? graph[i][k] : 1000, tmp + 1);
						}
					}
				}
			}

			for (int len = 1; len <= graphLength-1; len++) {
				int count = 0;
				for (int i = 0; i < graphLength; i++) {
					for (int k = i; k < graphLength; k++) {
						if (graph[i][k] == len) {
							count++;
						}
					}
				}
				System.out.println(count);
			}
		}
	}
}