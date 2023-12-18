import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int holiday = sc.nextInt();
		int homework = sc.nextInt();
		int days = 0;
		for (int i = 0; i < homework; i++) {
			days += sc.nextInt();
		}
		sc.close();

		if (holiday < days) {
			System.out.print(-1);
		} else {
			System.out.print(holiday - days);
		}
	}
