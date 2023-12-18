import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {
			height[i] = scan.nextInt();
		}
		
		int count = 1;
		int highest = height[0];
		for (int i = 1; i < num; i++) {
			if (highest <= height[i]) {
				highest = height[i];
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}
}