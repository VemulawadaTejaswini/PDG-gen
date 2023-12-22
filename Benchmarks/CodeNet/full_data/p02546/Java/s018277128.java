import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();

	    if (s.lastIndexOf("s") == s.length() - 1) {
	    	System.out.println(s + "es");
	    } else {
	    	System.out.println(s + "s");
	    }
	}

}