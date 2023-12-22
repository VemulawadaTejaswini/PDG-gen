import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
                int size, i, j, temp = 0;
		int arr[] = new int[50];
		size = stdin.nextInt();
		for (i = 0; i < size; i++) {
			arr[i] = stdin.nextInt();
		}
		j = i - 1;
		i = 0;
		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for (i = 0; i < size; i++) {
			System.out.print(arr[i] + "  ");

		}
	}
}