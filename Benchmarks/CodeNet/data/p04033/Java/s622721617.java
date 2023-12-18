import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > 0 && b > 0) {
			System.out.println("Positive");
		} else if (a < 0 && b < 0 && (a + b) % 2 == 0) {
			System.out.println("Negative");
		} else if (a * b <= 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Positive");
		}
		
	}
}
