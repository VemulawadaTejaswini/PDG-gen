import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int count;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		count = sort(num);

		for (int k = 0; k < num.length; k++) {
			if (k > 0) {
				System.out.print(" ");
			}
			System.out.print(num[k]);
		}
		System.out.println("\n" + count);
	}

	public static int sort(int[] num) {
		int count = 0;
		int min, temp;
		for (int i = 0; i < num.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[min]) {
					min = j;
				}
				temp = num[min];
				num[i] = num[min];
				num[min] = temp;
			}
			count++;
		}
		return count;
	}
}

