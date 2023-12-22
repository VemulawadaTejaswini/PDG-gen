import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int arr[][] = new int[3000][2];
		int i = 0, temp = 0, count = 0;
		for (i = 0; i < 3000; i ++) {
			arr[i][0] = stdin.nextInt();
			arr[i][1] = stdin.nextInt();
			if (arr[i][0] > arr[i][1]) {
				temp = arr[i][0];
				arr[i][0] = arr[i][1];
				arr[i][1] = temp;
			}
			if (arr[i][0] == 0 && arr[i][1] == 0) {
				count = i;
				break;
			}
		}
		for (int j = 0; j < count; j++) {
			System.out.println(arr[j][0] + " " + arr[j][1]);
		}
	}
}