import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int minMax = 0;
		int sum = 0;

		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum = sum + A[i];
		}

		quick_sort(A, 0, N-1);

		double s = A[N-M];
		double dsum = sum;

		if(s >= (dsum / (4 * M))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	static void quick_sort(int[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }

}
