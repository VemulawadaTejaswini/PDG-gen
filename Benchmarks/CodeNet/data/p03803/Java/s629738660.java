import java.util.*;


public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String ans ;
    if(A == B){
      ans = "Draw";
    }else if(A < B && A != 1){
      ans = "Bob";
    }else if(B == 1){
      ans = "Bob";
    }else{
      ans = "Alice";
    }
    System.out.println(ans);
  }
}
