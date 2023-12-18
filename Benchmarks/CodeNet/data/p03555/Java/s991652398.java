import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s1, s2;
    s1 = sc.next();
    s2 = sc.next();
    int n = s1.length();
    int count = 0;
    for(int i = 0; i < n; ++i){
      if(s1.charAt(i) == s2.charAt(n - 1 - i)){
        ++count;
      }
      else break;
    }
    if(count == 3)System.out.println("YES");
    else System.out.println("NO");
  }
}