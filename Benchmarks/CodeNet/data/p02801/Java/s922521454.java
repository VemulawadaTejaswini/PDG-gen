import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter character: ");
		Scanner scnr=new Scanner(System.in);
		String s;
		s=scnr.next();
		char c=s.charAt(0);
		int ascii=(int)c;
		ascii++;
		c=(char)ascii;
		System.out.println(c);			
	}
}
