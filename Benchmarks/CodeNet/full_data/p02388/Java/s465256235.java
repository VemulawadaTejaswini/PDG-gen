import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
	    // int x2 = s.nextInt();
		System.out.println(x * x * x);
	}
	public static void main(String[] args) {
		
		new Main().run();
	}
}