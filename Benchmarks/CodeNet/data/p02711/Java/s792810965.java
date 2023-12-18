import java.util.*;

public class Main {
 
	public static void main(String[] args) {
 
		// 3桁の整数
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
 
		if (x % 10 == 7) {
			System.out.println("Yes");
			return;
		}
 
		x = x / 10;
 
		if (x % 10 == 7) {
			System.out.println("Yes");
			return;
		}
 
		x = x / 10;
 
		if (x == 7) {
			System.out.println("Yes");
			return;
		}
 
		System.out.println("No");
 
	}
 
}