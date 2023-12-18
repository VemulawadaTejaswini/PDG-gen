import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumA = 0, sumB = 0;
		int cnt = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			cnt++;
		}
		int tmp;
		for(int i = 0; i < n; i++) {
			for(int k = i + 1; k < n; k++) {
				if(a[i] < a[k]) {
					tmp = a[i];
					a[i] = a[k];
					a[k] = tmp;
				}
			}
		}
		int i = 0;
		while(i < n - 1) {
			sumA += a[i];
			sumB += a[i + 1];
			i += 2;
		}
		if(cnt % 2 != 0) {
			sumA += a[n - 1];
		}
		System.out.println(sumA - sumB);
	}
}