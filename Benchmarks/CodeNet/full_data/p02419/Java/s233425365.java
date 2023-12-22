import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String w = sc.next();
    String end = "END_OF_TEXT";
    boolean tmp = true;
    int ans = 0;

    while(tmp){
      String t = sc.next();

      if(t.equals(end)){
        tmp = false;
        break;
      }

      if(t.equalsIgnoreCase(w)){
        ans += 1;
      }
    }

    System.out.println(ans);
  }
}

