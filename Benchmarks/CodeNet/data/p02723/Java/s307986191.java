import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      /*
      int n      = sc.nextInt();        // read input as integer
      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String
      */
     String s= sc.next();
     if((s.charAt(3)).equals(s.charAt(4)) && (s.charAt(2)).equals(s.charAt(6)))
     {
     	System.out.print("Yes");
     }else{
       		System.out.print("No");
         }
    }
}
