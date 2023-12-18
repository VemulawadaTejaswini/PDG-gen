import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.nextLine();
    String ans = "No";
    
    if (S % 2 == 0) {
      String s1 = S.substring(0, S/2);
      String s2 = S.substring(S/2, S);
      if (s1 = s2)
        ans = "Yes";
    }
    
    System.out.print(ans);
  }
}