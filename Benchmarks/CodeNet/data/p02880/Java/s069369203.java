import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		execute();
	}
 
	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			
			for(int i=1; i <=9; i++) {
				if(a%i==0) {
					if(a/i<=9) {
						System.out.println(true);
						return;
					}
				}
			}
			System.out.println(false);
			
		}
	}
}