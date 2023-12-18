import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    long L = scan.nextLong();
    long R = scan.nextLong();
    
    if(R-L >= 2019-(L%2019)){
      System.out.println(0);
      return;
    } else {
      System.out.println((L*(L+1))%2019);
    } 
  }
}