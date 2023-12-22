
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int count = 0;
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i]);
			if (i != num - 1)
				System.out.print(" ");
		}
		System.out.println("");
		System.out.println(count);
	}
}