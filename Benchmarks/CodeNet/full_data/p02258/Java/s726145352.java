import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int len = input1.nextInt();
		int first = input1.nextInt();
		int next = input1.nextInt();
		int curMin = Math.min(first, next);
		int curMax = next - first;
		// int diff;
		
		for (int i = 0; i < len-2; i++) {
			curMin = Math.min(curMin, next);
			next = input1.nextInt();
			// int diff = next - first;
			curMax = Math.max(curMax, next - curMin);			
			first = next;
		}		
		input1.close();
		System.out.println(curMax);
	}
}
