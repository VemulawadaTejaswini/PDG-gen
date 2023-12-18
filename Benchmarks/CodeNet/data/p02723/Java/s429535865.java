import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

		if ((input.charAt(2)==input.charAt(3)) &&
			(input.charAt(4)==input.charAt(5))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	    scan.close();	

    }
}