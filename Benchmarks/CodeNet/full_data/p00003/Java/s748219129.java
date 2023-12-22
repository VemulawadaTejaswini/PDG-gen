import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		Scanner date = new Scanner(System.in);
		
		int n = date.nextInt();
		
		while (n > 0) {
			int a = date.nextInt();
			int b = date.nextInt();
			int c = date.nextInt();
			
			if ((a == Math.sqrt(b * b + c * c)) || (b == Math.sqrt(c * c + a * a)) || (c == Math.sqrt(a * a + b * b))) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			n--;
		}
		
		
	}

}