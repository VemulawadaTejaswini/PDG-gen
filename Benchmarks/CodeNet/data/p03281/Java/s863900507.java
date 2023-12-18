import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	int n = sc.nextInt();
    
    if(n < 105) System.out.println(0);
    else if(n < 165) System.out.println(1);
    else System.out.println(2);

  }
}
