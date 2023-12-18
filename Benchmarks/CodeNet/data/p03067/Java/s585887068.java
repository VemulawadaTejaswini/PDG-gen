import java.util.*;

public class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    if(C>=Math.min(A, B)&&C<=Math.max(A, B)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}