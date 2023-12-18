import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
                 Scanner sc = new Scanner(System.in);
                 String a = sc.next();
                 String b = sc.next();
                 if ((a.charAt(0) == b.charAt(2)) && (a.charAt(1)==b.charAt(1)) && (a.charAt(2)==b.charAt(0))) {
                   System.out.println("Yes");
                  }
                 else{
                   System.out.println("No");
                  }
           }
}