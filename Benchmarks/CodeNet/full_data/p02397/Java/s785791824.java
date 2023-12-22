import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
	    int x, y ,min;
	    for(;;) {
	    	x = s.nextInt();
	 	    y = s.nextInt();
	    	if(x == 0 && y == 0) break;
	    	else if(x < y) System.out.println(x + " " + y);
	    	else  System.out.println(y + " " + x);
	    }
	    
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}