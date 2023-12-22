import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sort(num);
	}

	public static int sort(int[] num) {
		int count = 0;

		boolean flag = true;
		for (int i = 0; flag; i++) {
			flag = false;
			for (int j = num.length - 1; j >= i + 1; j--) {
				if (num[j - 1] > num[j]) {
					num[j - 1] = num[j - 1] ^ num[j];
					num[j] = num[j - 1] ^ num[j];
					num[j - 1] = num[j - 1] ^ num[j];
					count++;
					flag = true;
				}
			}
		}

		for (int k = 0; k < num.length; k++) {
			System.out.print(num[k] + " ");
		}
		System.out.println();
		System.out.print(count);
		return count;
	}
}

