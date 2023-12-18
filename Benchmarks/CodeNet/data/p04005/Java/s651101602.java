
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    if(A%2==0||B%2==0||C%2==0){
      System.out.println(0);
      return;
    }
    System.out.println(Math.min(A*B,Math.min(B*C,C*A)));

  }

  
}
