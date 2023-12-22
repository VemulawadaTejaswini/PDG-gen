import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
		}
		int temp;

		for (int i = 0; i < num.length; i++) {
			for (int j = num.length - 1; j < i; j--) {
				if (num[j] < num[j - 1]) {
					temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int a : num) {
			System.out.print(a);
			System.out.print(" ");
		}
		sc.close();
	}

}

