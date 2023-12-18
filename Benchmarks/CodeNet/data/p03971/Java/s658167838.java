import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    String S = sc.next();
    int K = A+B;
    int a = 0, b = 0;
    for(int i = 0; i < N; i++){
      String ans = "No";
      if(S.charAt(i) == 'a'){
        if(a < K){
          a++;
          ans = "Yes";
        }
      }else if(S.charAt(i) == 'b'){
        if(a < K && b < B){
          a++;
          b++;
          ans = "Yes";
        }
      }
      System.out.println(ans);
    }
  }
}