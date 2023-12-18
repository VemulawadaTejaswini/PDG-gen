import java.util.*;

public class Main {

	int[][][] cache;

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		Main soln = new Main();
		soln.cache = new int[m][n][2];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				for(int z=0; z<2; z++) soln.cache[i][j][z] = -1;
			}
		}
		int[] best = soln.cutter(m, n, 1);
		System.out.println(soln.calcDiv(best));
	}

	private int[] cutter(int mm, int nn, int cnt) {
		if(cnt==2 && cache[mm-1][nn-1][0]>0) return cache[mm-1][nn-1];

		int[] res = new int[4-cnt];
		if(cnt==3) {
			res[0] = mm*nn;
			return res;
		}

		int minDiv = mm*nn;
		int[] best = new int[4-cnt];
		for(int p=1; p<=mm/2; p++) {
			res[0] = p*nn;
			int[] temp = cutter(mm-p, nn, cnt+1);
			for(int x=0; x<temp.length; x++) {
				res[x+1] = temp[x];
			}
			int tempDiv = calcDiv(res);
			best = (tempDiv<minDiv)? Arrays.copyOf(res, res.length):best;
			minDiv = (tempDiv<minDiv)? tempDiv:minDiv;
		}
		for(int q=1; q<=nn/2; q++) {
			res[0] = q*mm;
			int[] temp = cutter(mm, nn-q, cnt+1);
			for(int x=0; x<temp.length; x++) {
				res[x+1] = temp[x];
			}
			int tempDiv = calcDiv(res);
			best = (tempDiv<minDiv)? Arrays.copyOf(res, res.length):best;
			minDiv = (tempDiv<minDiv)? tempDiv:minDiv;
		}
		if(cnt==2) cache[mm-1][nn-1] = Arrays.copyOf(best, best.length);
		return best;
	}

	private int calcDiv(int[] input) {
		Arrays.sort(input);
		return input[input.length-1] - input[0];
	}
}