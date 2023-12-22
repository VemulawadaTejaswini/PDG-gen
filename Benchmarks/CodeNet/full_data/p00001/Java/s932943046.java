import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = scan.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			int a = data[i];
			int indexMin = i;
			for (int k = i + 1; k < 10; k++) {
				if (data[k] < a) {
					a = data[k];
					indexMin = k;
				}
			}
			int temp = data[i];
			data[i] = data[indexMin];
			data[indexMin] = temp;
		}
		for (int i = 9; i >= 7; i--) {
			System.out.println(data[i]);
		}

	}

}