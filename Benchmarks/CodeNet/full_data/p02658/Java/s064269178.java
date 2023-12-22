import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long num = 0;
		long ans = 1;

		
		for(int i = 0; i < n; i++) {
			num = sc.nextLong();
			ans = ans * num;
		}
		
		System.out.println(num);

	}
}
