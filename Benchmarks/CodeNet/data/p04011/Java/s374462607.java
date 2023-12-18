import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int b = n - a;
		int day1 = a * x;
		int day2 = b * y;
		int total = day1 + day2;
		System.out.println(total);
	}
}