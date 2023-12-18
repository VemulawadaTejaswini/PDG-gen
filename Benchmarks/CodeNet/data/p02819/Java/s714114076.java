import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x == 2) {
			System.out.println(2);
			return;
		}
		
		for(int i = x; true; i++) {
			double a = Math.sqrt(x);
			long b = Math.round(a);
			for(int j = 2; j <= b; j++) {
				if(i % j == 0) {
					break;
				} else if(j == b) {
					System.out.println(i);
					return;
				}
			}
		}

	}
}
