import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();
    String ans = "No";

    if(t.substring(0, s.length()).equals(s)){
      ans = "Yes";
    }

    System.out.println(ans);
  }
}
