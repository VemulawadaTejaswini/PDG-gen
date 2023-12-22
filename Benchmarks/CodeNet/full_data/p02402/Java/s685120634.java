import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		minMaxSum();

	}
	
	public static void minMaxSum() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int min, max;
		long sum;
		
		int num = sc.nextInt();
		min = num;
		max = num;
		sum = num;
		
		for (int i = 0; i < n - 1; i++) {
			array[i] = sc.nextInt();
			
			if (min > array[i]) {
				min = array[i];
			} else if (max < array[i]) {
				max = array[i];
			}
			
			sum += array[i];
		}
		
		System.out.println(min + " " + max + " " + sum);
	}
}
