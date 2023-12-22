import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    char S = scanner.next().charAt(0);
	    
	    String result = "a";
	    if (Character.isUpperCase(S)) {
	        result = "A";
	    }


	    System.out.println(result);
	}

}