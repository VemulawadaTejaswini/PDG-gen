import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
    	
    	while (true) {
                scanner.reset();
    		String input = scanner.next();
    		if (input.equals("0")) {
    			break;
    		}
        	int output = 0;
	        for (int i = 0; i < input.length(); i++) {
	        	output += Integer.parseInt(String.valueOf(input.charAt(i)));
	        }
	        System.out.println(output);
    	}
    }
}