import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int t = sc.nextInt();
    
    int xMinusT = x - t;
    
    if (xMinusT >= 0) {
      System.out.println(xMinusT);
    } else {
      System.out.println(0);
    }
  }
}