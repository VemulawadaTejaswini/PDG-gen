import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long ytotal = scanner.nextInt();
		long xtotal = scanner.nextInt();
		long c = scanner.nextInt();

		long a = ytotal*ytotal;
		long b = xtotal*xtotal;
		
		if(a + b - 2*xtotal*ytotal-c <0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
			
}