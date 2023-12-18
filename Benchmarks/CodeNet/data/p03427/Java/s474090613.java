import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int k = n.length() - 1;
		int ans = n.charAt(0) - '0' + 9 * (k - 1) - (n.matches(".9*") ? 0 : 1);
				
		System.out.println(ans);
	}	
}
