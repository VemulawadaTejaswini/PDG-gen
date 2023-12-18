import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    String T = sc.nextLine();
    String ans = "";
    for(int i = 0; i < N; i++){
      String s1 = S.substring(0, N-1-i);
      String s2 = S.substring(N-1-i, N);
      System.out.println(s1 + " " + s2);
    }
    
    System.out.println(ans);
  }
}
