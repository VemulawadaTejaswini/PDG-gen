import java.io.*;
import java.util.Scanner;
 
public class Main {
 
 
 
    public static void main(String[] args) {
 
 
        Scanner s = new Scanner(System.in);
         long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();
        long d = s.nextLong();
       if(c<=b&&(c>=a))
           System.out.println("Yes");
       else
           System.out.println("No");
 
    }
}
