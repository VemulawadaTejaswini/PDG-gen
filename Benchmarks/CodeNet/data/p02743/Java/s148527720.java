import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long ytotal = scanner.nextInt();
		long xtotal = scanner.nextInt();
		long c = scanner.nextInt();
		
		if((xtotal + ytotal)*(xtotal + ytotal) - 2*xtotal*ytotal-c <0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
			
}
