import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();
    
    if(a > x){
      System.out.println("NO");
      return;
    }
    
    if(x - a <= b){
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
      return;
   }
}