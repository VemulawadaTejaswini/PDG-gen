import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();

		int ay = 0;
		int by = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'a') {
				if (ay + by < a + b) {
					System.out.println("Yes");
					ay++;
				} else {
					System.out.println("No");
				}
			} else if (s.charAt(i) == 'b') {
				if (ay + by < a + b && by < b) {
					System.out.println("Yes");
					by++;
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}
	}
}
