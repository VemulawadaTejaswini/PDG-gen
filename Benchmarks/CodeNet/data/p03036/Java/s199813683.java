
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		long r = sc.nextInt();
		long d = sc.nextInt();
		long x = sc.nextInt();
		
		
		for(int i = 0; i < 10;i++) {
			x = r * x - d;
			
			System.out.println(x);
		}
	}
}
