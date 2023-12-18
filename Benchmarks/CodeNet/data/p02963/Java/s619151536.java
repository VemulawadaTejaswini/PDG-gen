import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    long S = Long.parseLong(sc.next());
    long x1, y1, x2, y2, x3, y3;
    
    x1 = S;
    y1 = 0;
    x2 = 1;
    y2 = 1;
    x3 = 0;
    y3 = 0;
    
    System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);
  }
}