import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int x  = s.nextInt();
	    int x2 = s.nextInt();
	    System.out.print(x * x2 + " ");
		System.out.println(x + x +  x2 + x2);
	}
	public static void main(String[] args) {
		
		new Main().run();
	}
}