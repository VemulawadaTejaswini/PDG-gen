import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		int sum = a + b;
		int cnt = 0;
		while(sum > 0) {
			sum = sum / 10;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}