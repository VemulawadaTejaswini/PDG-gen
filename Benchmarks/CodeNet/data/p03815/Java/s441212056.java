import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
	
		long count = x / 11 * 2;
		
		if(x % 11 == 0) {
			System.out.println(count);
		} else if(x % 11 <= 6) {
			System.out.println(count + 1);
		} else {
			System.out.println(count + 2);
		}
	}
}
