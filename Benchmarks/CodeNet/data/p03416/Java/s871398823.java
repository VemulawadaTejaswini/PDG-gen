import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = 0;
		for(int i = A; i <= B; i++) {
			int num1 = i / 10000;
			int num2 = i / 1000 % 10;
			int num3 = i / 10 % 10;
			int num4 = i % 10;
			if(num1 == num4 && num2 == num3) {
				result++;
			}
		}
		System.out.println(result);
	}
}
