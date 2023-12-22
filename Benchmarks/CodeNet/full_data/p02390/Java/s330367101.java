import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
             
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       int h = s%60;
       int m = h%60;
            
       System.out.println("h:m:s");
         
    }
}