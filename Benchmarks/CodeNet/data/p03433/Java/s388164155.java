import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		
		while(n >= 0) {
			n = n-500;
		}
		
		if(n == 0) {
			System.out.println("Yes");
		}else {
			n = n + 500;
			if(n <= a) {
				System.out.println("Yes");
			}else {
				System.out.print("No");
			}
		}
		
		sc.close();
	}
}