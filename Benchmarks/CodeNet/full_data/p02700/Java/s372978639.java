import java.util.*;

public class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    
    while ((A > 0) || (C > 0)){
      C -= B;
      A -= D;
    }
    
    if (C<=0){
      System.out.println("Yes");
    } else if (A<=0){
      System.out.println("No");
    }
  }
}
    
    