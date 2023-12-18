import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[][] A = new int[N][2];
		for (int i=0;i<N;i++) {
			A[i][0] = i;
			A[i][1] = Integer.parseInt(sc.next());
		}
		Comparator<int[]> comparator = new Comparator<int[]>() {
    		@Override
    		public int compare(int[] o1, int[] o2) {
    			return Integer.compare(o1[1], o2[1]);
    		}
		};
		Arrays.sort(A, comparator);

		int max = A[N-1][1];
		int max_2 = A[N-2][1];
		int[] ans = new int[N];
		for (int i=0;i<N;i++) {
			if (i==N-1) {
				int index = A[i][0];
				ans[index] = max_2;
			} else {
				int index = A[i][0];
				ans[index] = max;
			}
		}
		for (int i=0;i<N;i++) {
			System.out.println(ans[i]);
		}
	}
}