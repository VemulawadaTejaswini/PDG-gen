import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		int sum = 0;
		int day = 0;
		
		do {
			day++;
			sum += a;
			sum += day % 7 == 0 ? b : 0 ;
		} while(sum < x);
		
		System.out.println(day);
		
	}
}

