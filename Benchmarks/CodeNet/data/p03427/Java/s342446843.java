import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		long ans = 0;
		
		int c = Integer.parseInt(n.substring(0, 1));
		int k = n.length() - 1;
		
		ans = c + 9 * (k - 1) - (n.matches(".9*") ? 0 : 1);
				
		System.out.println(ans);
	}	
}
