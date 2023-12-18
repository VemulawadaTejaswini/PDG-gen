import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    
    if((Math.max(A,C) - Math.min(A,C)) <= D){
      System.out.println("Yes");
    }
    else if((Math.max(A,B) - Math.min(A,B) <= D) || (Math.max(B,C) - Math.min(B,C)) <= D){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
