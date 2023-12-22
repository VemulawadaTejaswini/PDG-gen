import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.toString();

    	boolean a = Pattern.matches("^[A-Z]+$", x);

    	if(a = true) {
    		System.out.println("A");
    	}else {
    		System.out.println("a");
    	}

        scan.close();
    }
}