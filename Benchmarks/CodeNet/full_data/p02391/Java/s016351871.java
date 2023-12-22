import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
	    int b = s.nextInt();
	    int check = Math.max(a, b);
	    if(a == b) System.out.println("a == b");
	    else if(check == a ) System.out.println("a > b");
	    else System.out.println("a < b");
	    
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}