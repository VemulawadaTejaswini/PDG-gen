import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = num1/3600;
		int num3 = num1%3600/60;
		int num4 = num1%60;
		System.out.println(String.format("%s:%s:%s", num2,num3,num4));
	}
}