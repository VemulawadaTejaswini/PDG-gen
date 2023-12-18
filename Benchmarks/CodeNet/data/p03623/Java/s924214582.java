import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int xMinusA = x - a;
    int xa = Math.abs(xMinusA);
    
    int xMinusB = x - b;
    int xb = Math.abs(xMinusB);
    
    if (xa > xb) {
      System.out.println("B");
    } else if (xa < xb) {
      System.out.println("A");
    }
  }
}