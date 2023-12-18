import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    String T = sc.nextLine();
    String ans = "";
    boolean check = true;
    for(int i = 0; i < N; i++){
      String s1 = S.substring(0, N-1-i);
      String s2 = S.substring(N-1-i, N);
      String t1 = T.substring(0, i+1);
      String t2 = T.substring(i+1, N);
      if(s2.equals(t1)){
        ans = S+t2;
        check = false;
      }
    }
    if(check){
      ans = S+T;
    }
    
    System.out.println(ans);
  }
}
