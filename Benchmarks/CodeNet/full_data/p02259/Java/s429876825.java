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
		
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < num - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					count++;
					sorted = false;
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