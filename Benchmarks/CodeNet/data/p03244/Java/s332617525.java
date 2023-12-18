
import java.util.Scanner;

 class Main {
	static int[] f1 = new int[100005], f2 = new int[100005];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int mx1 = 0, mx2 = 0;
		boolean chk = true;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (i > 0 && arr[i] != arr[i-1])
				chk = false;
			if (i % 2 == 0) {
				f1[arr[i]]++;
				if (f1[arr[i]] > mx1)
					mx1 = f1[arr[i]];
			} else {
				f2[arr[i]]++;
				if (f2[arr[i]] > mx2)
					mx2 = f2[arr[i]];
			}
		}
//		System.out.println(mx1 + " " + mx2);
		System.out.println(chk ? (n / 2) :((n/2)-mx1)+((n/2)-mx2));

	}
}