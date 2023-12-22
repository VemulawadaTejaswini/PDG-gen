import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String  u = "ai1333";
			int x = sc.nextInt();
			int y = x / 100;
			
			if(y > 0) {
				for(int i=1; i<=y; i++) {
					u += 3;
				}
			}
			System.out.println(u);
		}
	}
}
