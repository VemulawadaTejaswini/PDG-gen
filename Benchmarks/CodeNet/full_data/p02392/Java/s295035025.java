import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a >=0 && a <= 100) {
				if(b >=0 && b <= 100) {
					if(c >=0 && c <= 100) {
						if(a < b && b < c) {
							System.out.println("Yes");
						} else {
							System.out.println("No");
						}
					}
				}
			}
		}
	}
}