
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a * b == 15){
			System.out.println("*");
		}else if(a + b == 15){
			System.out.println("+");
		}else{
			System.out.println("x");
		}
		
	}
}
