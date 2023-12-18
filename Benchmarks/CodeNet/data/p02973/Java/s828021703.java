import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = i+1;
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, (x,y) -> x[1]-y[1]);
		for(int i = 1; i < N; i++) {
			if(A[i][1] > A[i-1][1])
				A[i][1] = A[i-1][1] + 1;
			else
				A[i][1] = A[i-1][1];
		}
		for(int i = 0; i < N; i++)
			A[i][1] -= A[0][1];
		int newN = A[N-1][1];
		int[] a = new int[newN+1];
		Arrays.sort(A, (x,y) -> x[0]-y[0]);
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(A[0][1]);
		a[A[0][1]]++;
		for(int i = 1; i < N; i++) {
			if(A[i][1] <= ts.first()) {
				ts.add(A[i][1]);
				a[A[i][1]]++;
			}
			else {
				ts.add(A[i][1]);
				int x = ts.lower(A[i][1]);
				ts.remove(x);
				a[A[i][1]]++;
				a[x]--;
				if(a[x] > 0)
					ts.add(x);
			}
		}
		int ans = 0;
		for(int i = 0; i <= newN; i++)
			ans += a[i];
		System.out.println(ans);

	}

}

