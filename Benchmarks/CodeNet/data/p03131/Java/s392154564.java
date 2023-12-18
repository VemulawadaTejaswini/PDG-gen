import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in) ;
	public static void main(String[]args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a > k || b - a <=2) {
			System.out.println(k+1);
			return;
		}
		
		
		k = k - a + 1;
		
		
		long r = a + k %2;
		r += (long)k/2 *(long)(b-a);
		
		System.out.println(r);
		
	}
}
