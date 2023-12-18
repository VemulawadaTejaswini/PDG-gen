import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextDouble();
    int aInt = (int) a;
    
    double sqrt = Math.sqrt(a);
    
    double cbrt = Math.cbrt(a);
    
    int b = 0;
    int ans = 0;
    
    if (sqrt < cbrt) {
      b = (int) cbrt;
      ans = b*b*b;
    } else {
      b = (int) sqrt;
      ans = b*b;
    }
    
    if (ans < 32 && 32 <= aInt){
      ans = 32;
    } else if (ans < 128 && 128 <= aInt){
      ans = 128;
    } else if (ans < 243 && 243 <= aInt){
      ans = 243;
    }
    
    System.out.println(ans);
    
  }
}