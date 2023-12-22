import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[][] c;

	static boolean[] u;

	static void perm(int depth, int sum) {
		c[depth][sum]++;
		for (int i = 0; i < 10; i++) {
			if (u[i])
				continue;
			u[i] = true;
			perm(depth + 1, sum + (depth + 1) * i);
			u[i] = false;
		}
	}

	public static void main(String[] args) throws Exception {
		c = new int[11][331];
		u = new boolean[10];
		Arrays.fill(u, false);
		for (int i = 0; i < 11; i++)
			Arrays.fill(c[i], 0);
		perm(0, 0);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = bf.readLine()) != null) {
			String p[] = str.split(" ");
			if(p.length!=2)break;
			int n = Integer.parseInt(p[0]);
			int s = Integer.parseInt(p[1]);
			System.out.println(c[n][s]);
		}
	}
}