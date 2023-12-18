import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    int A = sn.nextInt();
    int B = sn.nextInt();
    int C = sn.nextInt();
    
    if(( A == B && A != C )
       || ( A == C && A != B )
       || ( B == C && B != A )) {
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}
