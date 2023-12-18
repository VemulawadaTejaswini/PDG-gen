import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
    	Scanner file = new Scanner(System.in);
      	String s = file.next();
      	file.close();
      	boolean works = is(s) && is(s.substring(0,s.length()/2)) && is(s.substring(s.length()/2+1));
      	System.out.println(works ? "Yes" : "No");
      	System.exit(0);
    }
  	public static boolean is(String s) { return new StringBuilder(s).reverse().toString().equals(s); }
}