import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
	    double a = s.nextDouble();
	    double b = s.nextDouble();
	    int d = (int)(a / b);
	    int r = (int)(a % b);
	    double f = a / b;
	    System.out.println(d+" "+ r + " "+ f);
	    
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}