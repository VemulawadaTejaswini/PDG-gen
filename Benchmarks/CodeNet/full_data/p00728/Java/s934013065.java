import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[100];
			int max = 0;
			int min = 1000;
			int sum = 0;
			int point;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				if (max < a[i])
					max = a[i];
				if (min > a[i])
					min = a[i];
				sum += a[i];
			}

			sum = sum - min - max;
			point = sum / (n - 2);
			System.out.println(point);
		}
		sc.close();
	}
}