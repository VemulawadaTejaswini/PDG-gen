import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			int sum = 0;
			int pos = 0;
			for(int j = 0; j < n; j++) {
				if(i == j)
					continue;

				sum += Math.abs(pos - a[j]);
				pos = a[j];
			}
			sum += Math.abs(pos);
			System.out.println(sum);
		}
	}
}
