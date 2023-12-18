import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double W = sc.nextDouble();
    double H = sc.nextDouble();
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    
    int judge = 0;
    double ans = W*H/2;
    if(W/2==x && H/2==y){
      judge = 1;
    }
    
    System.out.println(ans + " " + judge);
    
  }
}