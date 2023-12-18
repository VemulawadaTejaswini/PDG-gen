import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] saitanro = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				saitanro[i][j] = sc.nextLong();
			}
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (saitanro[i][j] > saitanro[i][k] + saitanro[k][j]) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		while(true) {}
//		ArrayDeque<Integer> deq = new ArrayDeque<>();
//		deq.push(0);
//		long ans = 0;
//		boolean[] visited = new boolean[n];
//		while (deq.isEmpty()) {
//			int v = deq.poll();
//			if (visited[v]) {
//				continue;
//			}
//			visited[v] = true;
//			for (int i = 0; i < n; i++) {
//				if(visited[i]==false) {
//
//				}
//			}
//		}
	}
}