import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class solution {
	static int n, k;
	static int[][] axis;	
	public static int res(int k) {
		int re = -1, cont = 0;
		int tem = 0, tn = 0;
		for (int i = 0; i < axis.length; i++) {
			if (axis[i][0] >= 0) {
				axis[i][1] = axis[i][0];
				tem = i + 1;
				axis[i - 1][1] = Math.abs(axis[i - 1][0]);
				tn = i - 2;
				break;
			}

		}
		for (int i = tem; i < axis.length; i++) {
			axis[i][1] = axis[i][0] - axis[i - 1][0];
		}
		for (int i = tn; i >= 0; i--) {
			axis[i][1] = axis[i + 1][0] - axis[i][0];
		}
		Set<Integer> set = new TreeSet<Integer>();
		int left = tem - 1, right = tem - 2;
		char lf = 'f', rg = 'f';
		int s = getplace(left, right);

		while (s != -1) {
			if (left < 0 || right > axis.length) {
				break;
			}
			set.add(axis[s][0]);		
			cont++;
			for (int i = s; i >= 0; i--) {
				lf = 'f';
				if (axis[i][2] == 0) {
					left = i;
					lf = 't';
					break;
				}

			}

			if ((lf != 't') && (right < axis.length)) {
				left = right;				
			}

			for (int i = s; i < axis.length; i++) {
				rg = 'f';
				if (axis[i][2] == 0) {
					right = i;
					rg = 't';
					break;
				}

			}
			if ((rg != 't') && (left >= 0)) {
				right = left;				
			}

			s = getplace(left, right);

			if (cont >= k) {
				break;
			}

		}

		Integer[] arry = set.toArray(new Integer[0]);
		Arrays.sort(arry);
		int len = arry.length;

		set.clear();
		re = Math.max(Math.abs(arry[0]), Math.abs(arry[len - 1]))
				+ 2 * Math.min(Math.abs(arry[0]), Math.abs(arry[len - 1]));
		return re;
	}

	public static int getplace(int a, int b) {
		int re = -1;
		if ((a >= 0) && (b < axis.length)) {
			int comp = Math.min(axis[a][1], axis[b][1]);			
			if (comp == axis[a][1]) {
				axis[a][2] = 1;
				re = a;
			} else {
				axis[b][2] = 1;
				re = b;
			}
		} else if (a < 0 && b < axis.length) {
			re = b;
			axis[b][2] = 1;
		} else if (b > axis.length && a >= 0) {
		}
		return re;

	}

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);		
			n = sc.nextInt();
			k = sc.nextInt();			
			axis = new int[n][3];
			for (int i = 0; i < n; i++) {
				axis[i][0] = sc.nextInt();				
				axis[i][2] = 0;
			}
			
			int len = axis.length;
			if (n == 0) {
				System.out.println("0");
			} else if ((n == 1 && k == 1) & axis[0][0] == 0) {
				System.out.println("0");
			} else if (axis[0][0] >= 0) {
				System.out.println(axis[k - 1][0]);
			} else if (axis[len - 1][0] <= 0) {
				System.out.println(Math.abs(axis[len - k][0]));
			} else {
				System.out.println(res(k));

			}

		}	

}
