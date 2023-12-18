import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      
      	String x = sc.next();
      	char[] x_chars = x.toCharArray();
      	Arrays.sort(x.chars);
      	String x_asc = new String(x_chars);
      
        String y = sc.next();
      	char[] y_chars = x.toCharArray();
      	Arrays.sort(y.chars);
      	String y_asc = new String(y_chars);  
      	String y_desc = new StringBuilder(y_asc).reverse.toString();
      
     	if(x_asc.compareTo(y_desc) < 0)
          System.out.println("Yes");
      	else
          System.out.println("No");

	}
}