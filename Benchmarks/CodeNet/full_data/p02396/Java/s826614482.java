import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int x;
		int i = 1;
	    for(;;){
	    	x = s.nextInt();
	    	if(x == 0) break;
	    	System.out.println("Case " + i + ": " + x);
	    	i++;
	    }
	    
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}