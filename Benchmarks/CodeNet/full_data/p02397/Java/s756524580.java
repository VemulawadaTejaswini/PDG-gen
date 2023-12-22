import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
	    int x, y;
	    for(;;) {
	    	x = s.nextInt();
	 	    y = s.nextInt();
	    	if(x == 0 && y == 0) break;
	    	System.out.println(x + " " + y);
	    }
	    
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}