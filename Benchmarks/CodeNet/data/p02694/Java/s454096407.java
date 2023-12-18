import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
    	
    	double n = 100;
    	int i = 0;
    	
    	while(n < x) {
    		n = (int)(n + (n * 0.01));
    		i++;
    	}

    	System.out.println(i);
    	
        scan.close();
    }
}