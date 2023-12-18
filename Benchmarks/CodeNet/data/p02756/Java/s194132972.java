import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    StringBuilder A = new StringBuilder(S);
    int Q = sc.nextInt();
    for(int i = 0;i < Q;i++){
      String Query = sc.next();
      if(Query.charAt(0) == 1){
        A = A.reverse();
      }else if(Query.charAt(0) == 2){
        if(Query.charAt(2) == 1){
          A.insert(0,Query.charAt(4));
        }else if(Query.charAt(2) == 2){
          A.append(Query.charAt(4));
        }
      }
    }
    System.out.print(A);
  }
}