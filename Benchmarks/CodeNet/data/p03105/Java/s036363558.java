import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int x = B;
		int count = 0;
		
		while(x >= A && count < C) {
			count++;
			x -= A;
		}
		System.out.println(count);
	}
}
