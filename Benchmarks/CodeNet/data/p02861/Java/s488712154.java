import java.util.Scanner;

public class Main {
	static int[][] points;
	static double sum;
	static double con;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		points = new int[N][2];
		int[] perm = new int[N];

		for (int i = 0; i < N; i++) {
			points[i][0] = sc.nextInt();
			points[i][1] = sc.nextInt();
			perm[i] =i;
		}

		Main main = new Main();

		main.permutation(perm);

		System.out.println(sum / con);
	}

	public void permutation(int[] seed) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
    }

	public void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
        if (index == seed.length) {
            procPerm(perm);
            return;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i]) continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1);
            used[i] = false;
        }
    }

	public void procPerm(int[] perm) {
		con++;
		for (int i = 1; i < perm.length; i++) {
			sum += Math.sqrt(Math.pow(points[perm[i - 1]][0] - points[perm[i]][0], 2) + Math.pow(points[perm[i - 1]][1] - points[perm[i]][1], 2));
		}
        return;
    }

}