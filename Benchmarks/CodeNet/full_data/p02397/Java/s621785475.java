import java.util.Scanner;

public class Main {
	
	
	void main() {
		try(Scanner sc = new Scanner(System.in)) {
            for(;;) {
            	int x = sc.nextInt();
            	int y = sc.nextInt();
            	if(y == 0 && x == 0) break;
            	
            	System.out.println(Math.min(x,  y) + " " + Math.max(x,  y));
            }
        }
	}
	
	public static void main(String[] args) {
	    new Main().main();
	}

}
