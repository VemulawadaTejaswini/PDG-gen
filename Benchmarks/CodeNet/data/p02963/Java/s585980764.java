import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    long S = Long.parseLong(sc.next());
    
    long x1 = S;
    long y1 = 0;
    long x2 = 1;
    long y2 = 1;
    long x3 = 0;
    long y3 = 0;

    long g = (long)Math.sqrt(x1);
    if(g*g != x1){
      g++;
    }

    x1 = g;
    y2 = g;
    y1 = g*g-S;
    
    System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);
    
    
    long a = x1*y2;
    long b = x2*y1;
    
    System.out.println(" ");
    System.out.println(Math.abs(a-b));
  }
}