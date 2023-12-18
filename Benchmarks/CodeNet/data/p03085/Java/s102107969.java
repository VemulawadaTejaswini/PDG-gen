import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = T;
    String C = G;
    String G = C;
    String T = A;
    String N = sc.next();
    switch(N){
      case A:
        System.out.println(A);
        break;
      case C:
        System.out.println(C);
        break;
      case G:
        System.out.println(G);
        break;
      case T:
        System.out.println(T);
        break;
    }
  }
}
