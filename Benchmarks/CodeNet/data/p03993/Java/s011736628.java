import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];

		for (int i = 1; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int cnt = 0;
		for (int i = 1; i < a.length; i++) {
			if (i == a[a[i]])
				cnt++;
		}

		int pair = cnt / 2;
		System.out.println(pair);

		sc.close();
	}

}
