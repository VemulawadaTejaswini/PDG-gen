import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sA();
	}
	
	void sA() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b % a == 0) {
			System.out.println(a + b);
		}
		else System.out.println(b - a);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
