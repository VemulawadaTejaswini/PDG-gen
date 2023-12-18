
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
	 
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	String st = Math.abs(a-b) <= 1 ? "Brown" : "Alice";
	 System.out.println(st);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}