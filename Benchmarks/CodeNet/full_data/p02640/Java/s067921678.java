import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); // 頭数
    int y = sc.nextInt(); // 足の数
    double crane = -y/2 + 2*x;
    double turtle = x - crane;
    if(turtle < 0 || turtle > 100 || crane < 0 || crane > 100){
      System.out.println("No");
    }else{
      if(turtle % 1 != 0 || crane % 1 != 0 ){
         System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }
  }
}