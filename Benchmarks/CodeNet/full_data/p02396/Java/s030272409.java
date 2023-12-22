import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int i = 0;
	    int x = 0;
	    while(true){
	        
            x = sc.nextInt();
            i++;
            if ( x == 0 ){
              break;  
            }
            System.out.println("Case "+i+": "+x);
	    }
	    
	}
}
