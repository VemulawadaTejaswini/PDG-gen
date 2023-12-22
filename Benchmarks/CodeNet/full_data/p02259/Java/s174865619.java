
import java.util.Scanner;

/**
 * 冒泡排序
 * @author MZ21G
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int flag = 0;
		for (int k = 1; k <= N; k++) {
			for (int i = arr.length - 1; i > 0; i--) {
				int j = i - 1;
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					flag++;
				}
			}
		}
	
		
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println(arr[arr.length - 1]);
		System.out.println(flag);
		
		
	}
}

