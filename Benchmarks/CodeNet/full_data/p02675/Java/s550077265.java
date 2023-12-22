import java.util.*;
 
public class Main {
  public static void main(String[] arguments) {
    
    Scanner N = new Scanner(System.in);
    int rem = N%10;
    
    if (rem == 3) System.out.println("bon");
    else if (rem == 0 || rem == 1 || rem == 6 || rem == 8) System.out.println("pon");
    else System.out.println("hon");
  }
}