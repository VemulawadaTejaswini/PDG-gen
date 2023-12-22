import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int arr[] = new int[3000];
		int i = 0, temp = 0, count = 0;
		for (i = 0; i < 3000; i += 2) {
			arr[i] = stdin.nextInt();
			arr[i + 1] = stdin.nextInt();
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
			if (arr[i] == 0 && arr[i + 1] == 0) {
				count = i;
				break;
			}
		}
		for (int j = 0; j < count; j += 2) {
			System.out.println(arr[j] + " " + arr[j + 1]);
		}
	}
}