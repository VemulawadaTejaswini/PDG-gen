import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private BufferedReader br;
	private int n, m;
	private StringTokenizer st;
	private int[][] tree;
	private int[] ntree;
	private boolean Iseven;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Main().start();
	}

	private void start() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		tree = new int[m][2];
		ntree=new int[m];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			tree[i][0] = Integer.parseInt(st.nextToken());
			tree[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < m; i++) {
			if (tree[i][0] > tree[i][1]) {
				for (int j = tree[i][1]; j < tree[i][0]; j++) {
					ntree[j]++;
				}
			} else {
				for (int j = tree[i][0]; j < tree[i][1]; j++) {
					ntree[j]++;
				}
			}
		}
		Iseven = true;
		for (int i = 0; i < m; i++) {
			if (ntree[i] % 2 == 1) {
				Iseven = false;
			}
		}
		if (Iseven) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
