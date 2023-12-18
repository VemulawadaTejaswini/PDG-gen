import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int half = s.length() / 2;
    String ans = "Yes";

    for(int i = 0; i < half; i++){
      if(s.charAt(i) != s.charAt(half - 1 - i)){
        ans = "No";
        break;
      } else if(s.charAt(half + 1 + i) != s.charAt(s.length() - 1 - i)){
        ans = "No";
        break;
      }
    }

    System.out.println(ans);
  }
}
