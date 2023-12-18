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
		int maxa_n = N - 1;
		int maxb = N - 1;
		int maxb_n = N - 1;
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
			maxa_n = maxa - 1;
			boolean fa = false;
			boolean fb = false;
			if(maxa_n == -1) fa = true;
			in1 : while(maxa_n != -1 && flag[A2[maxa_n][0]]) {
				maxa_n--;
				if(maxa_n == -1) {
					fa = true;
					break in1;
				}
			}
			while(flag[B2[maxb][0]]) {
				maxb--;
			}
			maxb_n = maxb - 1;
			if(maxb_n == -1) fb = true;
			in2 : while(maxb_n != -1 && flag[B2[maxb_n][0]]) {
				maxb_n--;
				if(maxb_n == -1) {
					fb = true;
					break in2;
				}
			}
			if(cnt % 2 == 0) {
				cnt++;
				int temp = 0;
				if(fa) {
					temp = A2[maxa][1];
				} else {
					temp = A2[maxa][1] - A2[maxa_n][1];
				}
				if(Math.abs(C[N - 1 - right][1]) > Math.abs(C[left][1])) {
					if(temp >= Math.abs(C[N - 1 - right][1])) {
						ans += A2[maxa][1];
						flag[A2[maxa][0]] = true;
					} else {
					ans += A[(int)C[N - 1 - right][0]];
					flag[C[N - 1 - right][0]] = true;
					right++;
					}
				} else if(Math.abs(C[right][1]) < Math.abs(C[left][1])){
					if(temp >= Math.abs(Math.abs(C[left][1]))) {
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
				int temp = 0;
				if(fb) {
					temp = B2[maxb][1];
				} else {
					temp = B2[maxb][1] - B2[maxb_n][1];
				}
				if(Math.abs(C[N - 1 - right][1]) > Math.abs(C[left][1])) {
					//System.out.println("tes1");
					if(temp >= Math.abs(C[N - 1 - right][1])) {
						ans -= B2[maxb][1];
						flag[B2[maxb][0]] = true;
					} else {
					ans -= B[(int)C[N - 1 - right][0]];
					flag[C[N - 1 - right][0]] = true;
					right++;
					}
				} else if(Math.abs(C[right][1]) < Math.abs(C[left][1])){
					//System.out.println("test2");
					if(temp >= Math.abs(C[left][1])) {
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
