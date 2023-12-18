import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int sum = l * n;
		int[] aji = new int[n];
		for(int i = 0 ; i < n ; i++) {
			sum += i;
			aji[i] = l + i;
		}
		int min = Integer.MAX_VALUE / 2;
		int aji2 = 0;
		for(int i = 0 ; i < n ; i++) {
			int apple_pie = sum - aji[i];
			int sa = Math.abs(sum - apple_pie);
			if(min > sa) {
				aji2 = apple_pie;
				min = sa;
			}
		}

		sc.close();
		System.out.println(aji2);

	}
}

