import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int count = 0;
    if(A%2 == 0 && A == B && B == C){
      System.out.println(-1);
      return;
    }
    
    while(A%2 == 0 && B%2 == 0 && C%2 == 0){
      int a = A/2;
      int b = B/2;
      int c = C/2;
      
      A = b + c;
      B = c + a;
      C = a + b;
      count++;
    }
    System.out.println(count);
  }
}