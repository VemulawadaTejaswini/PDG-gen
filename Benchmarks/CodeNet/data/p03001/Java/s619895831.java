import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long W = sc.nextLong();
    long H = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();
    
    int judge = 0;
    long ans = W*H/2;
    if(W/2==x && H/2==y){
      judge = 1;
    }
    
    System.out.println(ans + " " + judge);
    
  }
}