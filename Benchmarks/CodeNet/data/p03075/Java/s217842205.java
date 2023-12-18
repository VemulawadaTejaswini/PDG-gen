import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] - array[i] > k) {
					System.out.println(":(");
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Yay!");
		}


	}

}
