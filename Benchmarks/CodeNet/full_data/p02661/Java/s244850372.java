import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		int lb = -1, ub = 1_000_000_000, mid;
		while(lb + 1 < ub) {
			mid = (lb + ub) / 2;
			int l = 0, h = 0, b = 0;
			for(int i = 0; i < N; i++) {
				if(B[i] < mid)
					l++;
				else if(A[i] > mid)
					h++;
				else
					b++;
			}
			if(l > h && l-h >= b)
				ub = mid;
			else if(h > l && h-l >= b)
				lb = mid;
			else
				lb = mid;
		}
		int lb2 = -1;
		ub = 1_000_000_000;
		while(lb2 + 1 < ub) {
			mid = (lb2 + ub) / 2;
			int l = 0, h = 0, b = 0;
			for(int i = 0; i < N; i++) {
				if(B[i] < mid)
					l++;
				else if(A[i] > mid)
					h++;
				else
					b++;
			}
			if(l > h && l-h >= b)
				ub = mid;
			else if(h > l && h-l >= b)
				lb2 = mid;
			else
				ub = mid;
		}
		if(N % 2 != 0)
			System.out.println(lb - ub + 1);
		else {
			double x = lb + 0.5, y = ub - 0.5;
			int ans = (lb - ub + 1) * 2 - 1;
			int l1 = 0, h1 = 0, b1 = 0, l2 = 0, h2 = 0, b2 = 0;
			for(int i = 0; i < N; i++) {
				if(B[i] < x)
					l1++;
				else if(A[i] > x)
					h1++;
				else
					b1++;
				if(B[i] < y)
					l2++;
				else if(A[i] > y)
					h2++;
				else
					b2++;
			}
			if(Math.abs(l1-h1) <= b1)
				ans++;
			if(Math.abs(l2-h2) <= b2)
				ans++;
			System.out.println(ans);
		}
	}

}