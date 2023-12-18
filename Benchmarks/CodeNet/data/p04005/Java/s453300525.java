
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    if(A%2==0||B%2==0||C%2==0){
      System.out.println(0);
      return;
    }
    System.out.println(Math.min(A*B,Math.min(B*C,C*A)));

  }

  
}
