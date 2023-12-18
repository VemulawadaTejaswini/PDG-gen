import java.util.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    
    double X = Math.sqrt(A) + Math.sqrt(B);
    double Y = Math.sqrt(C);
    System.out.println(X<Y ? "Yes" : "No");
  }
}