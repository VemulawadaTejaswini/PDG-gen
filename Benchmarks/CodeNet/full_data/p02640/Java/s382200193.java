import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    double a = (double)(2*x - (double)(y/2));
    double b = (double)(y - (2*x)) /2;
    // System.out.println(a);
    // System.out.println(b);
    if(a<0 || b<0){
      System.out.println("No");
    }else{
      if(a != (int)a || b != (int)b){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }
  }
}
