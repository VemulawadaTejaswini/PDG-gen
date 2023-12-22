import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[][] graph = new int[n][n];
	int u, k, v;
	String[] input;
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    u = Integer.parseInt(input[0]);
	    k = Integer.parseInt(input[1]);
	    for (int j = 0; j < k; j++) {
		v = Integer.parseInt(input[2+j]);
		graph[u-1][v-1] = 1;
	    }
	}
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n-1; j++) {
		sb.append(graph[i][j] + " ");
	    }
	    sb.append(graph[i][n-1] + "\n");
	}
	System.out.print(sb);
    }
}