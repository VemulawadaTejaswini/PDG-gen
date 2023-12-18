import java.util.*;
public class Main {
	public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		// get a integer
		String a = sc.nextLine();
		a = a.toUpperCase();

		StringBuilder str = new StringBuilder();
	    for (int i = 0; i < 4; i++)
	    	str.append(a.charAt(i));
	    str.append(' ');
	    for (int i = 4; i < 12; i++)
	    	str.append(a.charAt(i));
	    System.out.println(str);
    }
}