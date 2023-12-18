import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in) ;
	   char s[] = sc.nextLine().toCharArray();
	   long k = sc.nextLong();
	   for(int i = 0; i<Math.min(s.length, k); i++) {
		   if(s[i] != '1' ) {
			   System.out.println(s[i]);
			   return; 
		   }
	   }
	   System.out.println('1'); 
	}
}
