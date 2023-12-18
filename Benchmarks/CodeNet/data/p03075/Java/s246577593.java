import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		if (arr[4] - arr[0] > k) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
	}
}
