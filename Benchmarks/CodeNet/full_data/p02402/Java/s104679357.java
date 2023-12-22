import java.util.Scanner;

public classMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}
		int max = num[0], min = num[0], sum = num[0];
		for (int i = 1; i < n; i++) {
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
			sum += num[i];
		}
		System.out.println(min + " " + max + " " + sum);

	}

}