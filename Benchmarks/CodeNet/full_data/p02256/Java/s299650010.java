import java.util.Scanner;

public class Main {
	public static int findGreatestDivisor(int num1, int num2) {
		int checking = Math.max(num1, num2) % Math.min(num1, num2);
		if (checking == 0) return num1;
		int result = 0;
		
		while (checking > 0) {
			if (num1 % checking == 0 && num2 % checking == 0) {
				result = checking;
				break;
			}
			checking--;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		
		System.out.println(findGreatestDivisor(num1, num2));
	}
}

