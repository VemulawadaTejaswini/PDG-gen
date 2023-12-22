import java.util.Scanner;

// ALDS1_1_D
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (i == 0 && j == i + 1) max = array[j] - array[i];
				else if (max < array[j] - array[i]) max = array[j] - array[i];
			}
		}
		System.out.println(max);
	}
}

