
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static boolean[][] edge;
    private static int N;
    private static int M;

    public static void main(String[] args) {
	N = Integer.parseInt(scan.next());
	M = Integer.parseInt(scan.next());

	edge = new boolean[N][N];
	for (int i = 0; i < M; i++) {
	    int a = Integer.parseInt(scan.next()) - 1;
	    int b = Integer.parseInt(scan.next()) - 1;
	    edge[a][b] = edge[b][a] = true;
	}

	boolean[] data = new boolean[N];
	data[0] = true;
	int count = func(data, 0, 1);

	System.out.println(count);
	scan.close();
    }

    private static int func(boolean[] data, int node, int num) {
	if(num == N-1) {
	    int count = 0;
	    for (int i = 0; i < N; i++) {
		if(data[i] == false && edge[node][i] == true) count++;
	    }
	    return count;
	}

	int count = 0;
	for (int i = 0; i < N; i++) {
	    if(data[i] == false && edge[node][i] == true) {
		data[i] = true;
		count += func(data, i, num+1);
		data[i] = false;
	    }
	}
	return count;
    }
}
