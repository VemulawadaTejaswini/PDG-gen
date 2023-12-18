import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long W = sc.nextLong();
    long H = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();
    double ans = (W*H)/2.0;
    int can = 0;
    if(x*2 == W && y*2==H){
      can = 1;
    }
    
    System.out.println(ans + " " + can);
    
  }
}