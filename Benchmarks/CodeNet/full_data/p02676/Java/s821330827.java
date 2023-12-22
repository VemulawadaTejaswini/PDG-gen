import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		String s = sc.next();
		
		if(s.length() <= k) {
			System.out.println(s);
		}else {
			for(int i = 0; i < k; i++) {
				System.out.print((char)s.charAt(i));
			}
			System.out.println("...");
		}
	}
	
}
