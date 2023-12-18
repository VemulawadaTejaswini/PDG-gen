import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long H = sc.nextLong();
    	long index = 1;
    	long count = 0;
    	while (1 <= H) {
    		count += index;
    		H /= 2;
    		index *= 2;
    	}
    	System.out.println(count);
    }
}