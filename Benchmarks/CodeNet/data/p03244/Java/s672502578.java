import java.util.Scanner;

public class Main {
	static int MAX = 100100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int n;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(i % 2 == 0) a[x]++;
			else b[x]++;
		}

		int aMax = 0, aMaxId = 0, a2ndMax = 0;
		int bMax = 0, bMaxId = 0, b2ndMax = 0;
		for (int i = 0; i < MAX; i++) {
			if(aMax <= a[i]) {
				a2ndMax = aMax;
				aMax = a[i];
				aMaxId = i;
			} else if(a2ndMax <= a[i]) {
				a2ndMax = a[i];
			}

			if(bMax <= b[i]) {
				b2ndMax = bMax;
				bMax = b[i];
				bMaxId = i;
			} else if(b2ndMax <= b[i]) {
				b2ndMax = b[i];
			}
		}

		if(aMaxId != bMaxId) {
			System.out.println(n - aMax - bMax);
		} else if(a2ndMax > b2ndMax) {
			System.out.println(n - a2ndMax - bMax);
		} else {
			System.out.println(n - aMax - b2ndMax);
		}
	}
}