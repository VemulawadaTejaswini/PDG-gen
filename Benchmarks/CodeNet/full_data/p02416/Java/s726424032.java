import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    boolean tmp = true;

    while(tmp){
      String s = sc.next();
      int ans = 0;

      if(s.equals("0")){
        tmp = false;
        break;
      }

      for(int i = 0; i < s.length(); i++){
        ans += s.charAt(i) - '0';
      }

      System.out.println(ans);
    }
  }
}

