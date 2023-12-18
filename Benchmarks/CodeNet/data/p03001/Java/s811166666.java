import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int W = Integer.parseInt(sc.next());
    int H = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    
    double s = (double)W * (double)H / 2;
    int a = (W/2 == x && H/2 == y) ? 1 : 0;
    System.out.println(s+" "+a);
  }
}