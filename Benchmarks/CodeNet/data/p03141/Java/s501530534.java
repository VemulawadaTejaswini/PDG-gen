import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int A2[][] = new int[N][2];
		int B[] = new int[N];
		int B2[][] = new int[N][2];
		int C[][] = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			A2[i][0] = i;
			A2[i][1] = A[i];
			B[i] = sc.nextInt();
			B2[i][0] = i;
			B2[i][1] = B[i];
			C[i][0] = i;
			C[i][1] = A[i] - B[i];
		}
		long ans = 0;
		
		Arrays.sort(A2, Comparator.comparingLong(o -> o[1]));
		Arrays.sort(B2, Comparator.comparingLong(o -> o[1]));
		Arrays.sort(C, Comparator.comparingLong(o -> o[1]));
		int left = 0;
		int right = 0;
		int maxa = N - 1;
		int maxb = N - 1;
		boolean flag[] = new boolean[N];
		int cnt = 0;
		while(cnt < N) {
			while(flag[C[N - 1 - right][0]]) {
				right++;
			}
			while(flag[C[left][0]]) {
				left++;
			}
			while(flag[A2[maxa][0]]) {
				maxa--;
			}
			while(flag[B2[maxb][0]]) {
				maxb--;
			}
			if(cnt % 2 == 0) {
				cnt++;
				
				if(Math.abs(C[N - 1 - right][1]) > Math.abs(C[left][1])) {
					if(A2[maxa][1] >= Math.abs(C[N - 1 - right][1])) {
						ans += A2[maxa][1];
						flag[A2[maxa][0]] = true;
					} else {
					ans += A[(int)C[N - 1 - right][0]];
					flag[C[N - 1 - right][0]] = true;
					right++;
					}
				} else if(Math.abs(C[right][1]) < Math.abs(C[left][1])){
					if(A2[maxa][1] >= Math.abs(Math.abs(C[left][1]))) {
						ans += A2[maxa][1];
						flag[A2[maxa][0]] = true;
					} else {
					ans += A[(int)C[left][0]];
					flag[C[left][0]] = true;
					left++;
					}
				} else {
						ans += A2[maxa][1];
						flag[A2[maxa][0]] = true;
				}
			} else {
				cnt++;
				if(Math.abs(C[N - 1 - right][1]) > Math.abs(C[left][1])) {
					//System.out.println("tes1");
					if(B2[maxb][1] >= Math.abs(C[N - 1 - right][1])) {
						ans -= B2[maxb][1];
						flag[B2[maxb][0]] = true;
					} else {
					ans -= B[(int)C[N - 1 - right][0]];
					flag[C[N - 1 - right][0]] = true;
					right++;
					}
				} else if(Math.abs(C[right][1]) < Math.abs(C[left][1])){
					//System.out.println("test2");
					if(B2[maxb][1] >= Math.abs(C[left][1])) {
						ans -= B2[maxb][1];
						flag[B2[maxb][0]] = true;
					} else {
					ans -= B[(int)C[left][0]];
					flag[C[left][0]] = true;
					left++;
					}
				} else {
					//System.out.println("test3");
					ans -= B2[maxb][1];
					flag[B2[maxb][0]] = true;
				}
			}
			//System.out.println(ans);
		}
		
		System.out.println(ans);
	}
}
