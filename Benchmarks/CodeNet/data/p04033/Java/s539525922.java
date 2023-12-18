import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int B = Integer.parseInt(S[1]);
    
    String ans = "";
    if(A <= 0 && B >= 0){
      ans = "Zero";
    }else if(A > 0 && B > 0){
      ans = "Positive";
    }else{
      if((A + B) % 2 == 1){
        ans = "Positive";
      }else{
        ans = "Negative";
      }
    }
    System.out.println(ans);
  }
}