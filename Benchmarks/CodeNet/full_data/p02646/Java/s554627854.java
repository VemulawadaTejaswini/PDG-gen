import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt(), V=sc.nextInt(), B=sc.nextInt(), W=sc.nextInt(),T=sc.nextInt();
    int D, sa;
    if(W>=V) {
      System.out.println("NO");
    } else {
      if(A>=B) {
        D=A-B;
      } else {
        D=B-A;
      }
      sa=V-W;
      if(D<=sa*T) {
        System.out.println("YES");
      } else  {
        System.out.println("NO");
      }    
    }
  }
}