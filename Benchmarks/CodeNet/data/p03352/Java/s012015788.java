import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextDouble();
    
    double sqrt = Math.sqrt(a);
    
    int ans = (int) sqrt;
    
    System.out.println(ans);
  }
}