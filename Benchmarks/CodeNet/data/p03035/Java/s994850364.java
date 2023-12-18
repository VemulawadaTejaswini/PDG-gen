import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a >=13) {
			System.out.println(b);
		}else if ( a >= 6) {
			System.out.println(b/2);
		}else {
			System.out.println(0);
		}
		
	}
}
