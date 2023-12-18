    import java.util.Scanner;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.Arrays;
     
    public class Main {
    	public static void main(String args[]) {
    		Scanner scanner = new Scanner(System.in);
    		String inputString = scanner.nextLine();
    		
    		for(int i=0; i < inputString.length() -1; i++) {
    			inputString = inputString.substring(0, inputString.length() -1);
    			if (inputString.length() % 2 == 1) {
    				continue;
    			}
    			String frontString = inputString.substring(0, inputString.length() / 2);
    			String backString = inputString.substring(inputString.length() / 2);
    			
    			if (frontString.equals(backString)) {
    				System.out.println(inputString.length());
    				return;
    			}
    			
    		}
    	}
    }