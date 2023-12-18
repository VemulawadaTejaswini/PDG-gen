import java.util.Scanner;
import java.lang.*;

public class Main {

	public String run() {
		Scanner sc = new Scanner(System.in);
	 
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	String st = Math.abs(a-b) <= 1 ? "Brown" : "Alice";
	 System.out.println(st);
	return st;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}