import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int s = S.length();
    Set<Character> set = new HashSet<>();
    for(int i = 0; i < s; i++){
      set.add(S.charAt(i));
    }
    System.out.println(set.size() == s ? "Yes" : "No");
  }
}