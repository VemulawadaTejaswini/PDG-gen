
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());

	int[][] M = new int[N+1][10];
	for (int i = 1; i < 10; i++) {
	    M[0][i] = -1;
	}
	
	for (int i = 1; i <= N; i++) {
	    int w = Integer.parseInt(scan.next());
	    for (int j = 0; j < 10; j++) {
		int index = mod(j-w, 10);
		int tmp = (M[i-1][index] > -1 ? w + M[i-1][index] : -1);
		M[i][j] = max(M[i-1][j], tmp);		
	    }
	}
	int ans = 0;
	for (int i = 1; i < 10; i++) {
	    ans = (M[N][i] > ans ? M[N][i] : ans);
	}

	System.out.println(ans);
	scan.close();
    }

    private static int max(int x, int y) {
	return x > y ? x : y;
    }

    private static int mod(int x, int y) {
	return x >= 0 ? x % y : mod(x+y, y);
    }
}
