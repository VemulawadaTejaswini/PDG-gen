import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = T;
    String C = G;
    String G = C;
    String T = A;
    String N = sc.next();
    if(N.equal(A)){
      System.out.println(A);
    }else if(N.equal(C)){
      System.out.println(C);
    }else if(N.equal(G)){
      System.out.println(G);
    }else if(N.equal(T)){
      System.out.println(T);
    }
  }
}
