import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		boolean allplus = true;
		boolean allminus = true;
		long total = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(A[i] <= 0)
				allplus = false;
			if(A[i] >= 0)
				allminus = false;
			total += Math.abs(A[i]);
		}
		Arrays.sort(A);
		StringBuilder ans = new StringBuilder();
		if(allplus) {
			int a = A[0];
			System.out.println(total-A[0]*2);
			for(int i = 1; i < N-1; i++) {
				ans.append(a + " " + A[i] + "\n");
				a -= A[i];
			}
			ans.append(A[N-1] + " " + a + "\n");
			System.out.print(ans);
			return;
		}
		if(allminus) {
			int a = A[N-1];
			System.out.println(total+A[N-1]*2);
			for(int i = 0; i < N-1; i++) {
				ans.append(a + " " + A[i] + "\n");
				a -= A[i];
			}
			System.out.print(ans);
			return;
		}
		int a = A[0];
		int minusnum = 0;
		System.out.println(total);
		for(int i = N-2; i >= 0; i--) {
			if(A[i] > 0) {
				ans.append(a + " " + A[i] + "\n");
				a -= A[i];
			}
			else {
				minusnum = i;
				break;
			}
		}
		int b = A[N-1];
		ans.append(b + " " + a + "\n");
		b -= a;
		for(int i = 1; i <= minusnum; i++) {
			ans.append(b + " " + A[i] + "\n");
			b -= A[i];
		}		
		System.out.print(ans);

	}

}