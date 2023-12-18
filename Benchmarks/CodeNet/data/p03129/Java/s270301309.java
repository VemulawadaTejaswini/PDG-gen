import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in) ;
	public static void main(String[]args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if( (n + 1)/2 >= k) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
