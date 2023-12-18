import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String U = sc.next();
    if(U.equals(S)){
      System.out.println(A-1);
      System.out.println(" ");
      System.out.println(B);
    }else{
      System.out.println(A);
      System.out.println(" ");
      System.out.println(B-1);
    }
  }
  

  
}