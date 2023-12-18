import java.io.*;
import java.util.Scanner;

public class Main {

   public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

     String a = scan.next();
	 String b =scan.next();     
	 String c = scan.next();     

    
          	if ((a == b && b == c)&&(a==c))  {
          		System.out.println("1");
          	   } else if ((a != b || b !=c)&&(b !=c || c != a)) {
          	   	 System.out.println("2");
          	   	} else {
          	   	 System.out.println("3");
   } 
   }
   }
   