import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static final int M = 3;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		boolean[][] card = new boolean[M][];
		int[][] a = new int[M][M];
		HashMap<Integer, Pair> map = new HashMap<>();
		for (i = 0; i < M; i++) {
			card[i] = new boolean[M];
			for (j = 0; j < M; j++) {
				map.put(parseInt(sc.next()), new Pair(i, j));
			}
		}
		int n = parseInt(sc.next());
		int[] b = new int[n];
		for (i = 0; i < n; i++) {
			Pair p = map.get(parseInt(sc.next()));
			if(p!=null) {
//				out.println(p);
				card[p.i][p.j]= true; 
			}
		}
		sc.close();
		boolean f = false;
		for (i = 0; i < M; i++) {
			if(card[i][0]&&card[i][1]&&card[i][2]) f = true;
			if(card[0][i]&&card[1][i]&&card[2][i]) f = true;
		}
		if(card[0][0]&&card[1][1]&&card[2][2]) f = true;
		if(card[0][2]&&card[1][1]&&card[2][0]) f = true;
		out.println(f?"Yes":"No");
	}
}
class Pair {
	int i;
	int j;
	Pair(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "i=" + String.valueOf(i) + ":j=" + String.valueOf(j);
	}
}
