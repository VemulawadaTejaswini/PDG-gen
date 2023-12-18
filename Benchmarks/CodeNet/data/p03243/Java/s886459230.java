import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	String N = input.next();
      	int max = Math.max(Character.getNumericValue(N.charAt(0)), Character.getNumericValue(N.charAt(1)));
      	max = Math.max(max, Character.getNumericValue(N.charAt(2)));
		System.out.print("" + max + max + max);

    }
  	
}
