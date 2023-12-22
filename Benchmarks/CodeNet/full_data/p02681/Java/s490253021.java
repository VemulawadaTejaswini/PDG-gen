import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner file = new Scanner(System.in);
      	String s = file.next(), t = file.next();
      	System.out.println(s.equals(t.substring(0, t.length() - 1)) ? "Yes" : "No");
      	file.close();
    }
}
