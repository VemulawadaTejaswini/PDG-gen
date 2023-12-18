
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int N;
    private final int W;
    private int[][] vn;
    private int[] n;
    private long w0 = 0;

    public Main() {
	N = Integer.parseInt(scan.next());
	W = Integer.parseInt(scan.next());
	int[][] vs = new int[4][N];
	n = new int[4];

	for (int i = 0; i < N; i++) {
	    int w = Integer.parseInt(scan.next());
	    int v = Integer.parseInt(scan.next());

	    if(i == 0) w0 = w;

	    vs[(int)(w-w0)][n[(int)(w-w0)]] = v;
	    n[(int)(w-w0)]++;
	}
	for (int i = 0; i < 4; i++) {
	    Arrays.sort(vs[i]);
	}

	vn = new int[4][N+1];

	for (int i = 0; i < 4; i++) {
	    for (int j = 1; j <= N; j++) {
		vn[i][j] = vn[i][j-1] + vs[i][N-j];
	    }
	}

	scan.close();
    }

    public final void answer() {
	int ans = 0;
	for (int n0 = 0; n0 <= n[0]; n0++) {
	    for (int n1 = 0; n1 <= n[1]; n1++) {
		for (int n2 = 0; n2 <= n[2]; n2++) {
		    for (int n3 = 0; n3 <= n[3]; n3++) {
			if(w0*n0 + (w0+1)*n1 + (w0+2)*n2 + (w0+3)*n3 <= W) {
			    int tmp = vn[0][n0] + vn[1][n1] + vn[2][n2] + vn[3][n3];
			    if(tmp > ans ) ans = tmp;
			} else {
			    break;
			}
		    }
		}
	    }
	}
	System.out.println(ans);
    }
}
