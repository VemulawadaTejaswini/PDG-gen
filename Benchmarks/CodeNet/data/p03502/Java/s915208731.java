import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		char[] c = n.toCharArray();
		int a = Integer.valueOf(n);
		int sum = 0;
		
		for (int i = 0; i < c.length; i++) {
			sum += c[i] - '0';  
		}
		
		if (a % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}