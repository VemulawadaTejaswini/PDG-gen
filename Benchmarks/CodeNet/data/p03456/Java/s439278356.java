import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String as = sc.next();
		String bs = sc.next();
		
		String s = as + bs;
		int ab = Integer.parseInt(s);
		int count = 0;
		
		for(int i = 1; i <= ab; i++) {
			if(ab % i == 0) {
				count++;
			}
		}
		
		if(count % 2 == 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
