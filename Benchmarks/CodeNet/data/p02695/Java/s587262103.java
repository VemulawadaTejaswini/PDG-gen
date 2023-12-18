import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int[] a = new int[Q];
		int[] b = new int[Q];
		int[] c = new int[Q];
		int[] d = new int[Q];
		for(int i = 0; i < Q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		sc.close();
		Integer[] mList = new Integer[M];
		for(int i = 0; i < M; i++) {
			mList[i] = (i + 1);
		}
		
		int max = 0;
		for(Integer[] A : combination(mList, N)) {
			int ans = 0;
			// System.out.print("#" + Arrays.asList(A));
			for(int i = 0; i < Q; i++) {
				if(A[b[i] - 1] - A[a[i] - 1] == c[i]) {
					ans += d[i];
					// System.out.print(" " + d[i]);
				}
			}
			// System.out.println(" = " + ans);
			if(ans > max) max = ans;
		}
		
		System.out.println(max);
	}

    static List<Integer[]> combination(Integer[] data, int k) {
        List<Integer[]> result = new ArrayList<Integer[]>();
        combination(data, 0, new Integer[k], 0, result);
        return result;
    }

    static void combination(Integer[] data, int di, Integer[] comb, int ci, List<Integer[]> result) {
        if (ci == comb.length) {
            result.add(comb.clone());
            return;
        }
        for ( ; di <= data.length - (comb.length - ci); di++) {
			comb[ci] = data[di];
			for(int i = 0; i < comb.length; i++) {
				combination(data, di + i, comb, ci + 1, result);
			}
        }
    }
}