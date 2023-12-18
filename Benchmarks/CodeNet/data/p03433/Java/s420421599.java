import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%500 == 0) {
			System.out.println("Yes");
		}
		if(a%500-b <= 0) {
			System.out.println("Yes");
		}
		if(a%500-b > 0) {
			System.out.println("No");
		}
	}
}