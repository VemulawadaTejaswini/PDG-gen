import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
		}
		int pmax = 0, i, j;
		for (i = 0; i < n; i++) {
			if (max == a[i]) {
				for (j = 0; j < n; j++) {
					if (i != j)pmax = Math.max(pmax, a[j]);
				}
				System.out.println(pmax);
			} else {
				System.out.println(max);
			}
		}
	}
}
