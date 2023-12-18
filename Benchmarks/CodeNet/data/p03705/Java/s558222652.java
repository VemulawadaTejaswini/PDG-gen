
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int count = 0;
		    
		    
		    if(n == 1) {
		    	if(a != b) {
		    		count = 0;
		    	}else {
		    		count = 1;
		    	}
		    }else {
		    	if(a > b) {
		    		count = 0;
		    	}else {
		    		count = ((b-a)*(n-2)+1);
		    	}
		    }
		    System.out.println(count);
		    
		    sc.close(); }
}
