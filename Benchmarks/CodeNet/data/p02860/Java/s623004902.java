import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int N = sc.nextInt(), T=N/2;
    String S = sc.next();
    if(N % 2 !=0) {
      System.out.println("No");
    } else if(S.substring(0,T).equals(S.substring(T,N))){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}