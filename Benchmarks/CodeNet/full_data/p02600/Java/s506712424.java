import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    
    if (x >= 400 && 599 >= x)
      System.out.print("8");
    if (x >= 600 && 799 >= x)
      System.out.print("7");
    if (x >= 800 && 999 >= x)
      System.out.print("6");
    if (x >= 1000 && 1199 >= x)
      System.out.print("5");
    if (x >= 1200 && 1399 >= x)
      System.out.print("4");
    if (x >= 1400 && 1599 >= x)
      System.out.print("3");
    if (x >= 1600 && 1799 >= x)
      System.out.print("2");
    if (x >= 1800 && 1999 >= x)
      System.out.print("1");
  }
}