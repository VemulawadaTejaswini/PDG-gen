import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.next();
		char[] string = new char[line.length()];
	    for (int i = 0; i < line.length(); i++) {
	      string[i] =line.charAt(i);
	    }
	    int a = Character.getNumericValue(string[0]);
	    int b = Character.getNumericValue(string[1]);
	    int c = Character.getNumericValue(string[2]);
	    int d = Character.getNumericValue(string[3]);
	    
	    int i = a * 10 + b;
	    int j = c * 10 + d;
	    
	    int mflag = 0;
	    if(i <= 12 && j <= 12 && i != 0 && j != 0) {
	    	System.out.println("AMBIGUOUS");
	    } else if ((i > 12 && j > 12) || (i == 0 && j == 0) || (i == 0 && j > 12) || (i > 12 && j == 0)) {
	    	System.out.println("NA");
	    } else if(i <= 12 && j > 12) {
	    	System.out.println("MMYY");
	    } else {
	    	System.out.println("YYMM");
	    }
	  }
}