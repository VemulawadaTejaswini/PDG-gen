import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		int ans_i = 0;
		int ans_j = 0;
		
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}

		for (int i=0;i < n;i++) {
			for (int j=0;j < n;j++) {
				if (a[i] > a[j]) {
					int tmp = comb(a[i], a[j]);
					if (max < tmp) {
						max = tmp;
						ans_i = a[i];
						ans_j = a[j];
					}
				}
			}	
		}
		
		if (ans_i > ans_j) {
			System.out.println(ans_i + " " + ans_j);			
		} else {
			System.out.println(ans_j + " " + ans_i);
		}
	}
	
	static int comb(int i, int k) {
		k = i < k ? i : k;
		if (k == 0) {
			return 1;
		} else {
			return comb(i-1,k-1) * i/k;
		}
	}
}