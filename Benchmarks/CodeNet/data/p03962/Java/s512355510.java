import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.nextLine());
    int B = Integer.parseInt(sc.nextLine());
    int C = Integer.parseInt(sc.nextLine());
    int ans = 0;
    
    if(A == B && B == C){
      ans = 1;
    }else if(A == B || B == C || C == A){
      ans = 2;
    }else{
      ans = 3;
    }
    System.out.println(ans);
  }
}