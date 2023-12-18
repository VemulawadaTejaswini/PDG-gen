import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = s.length();
    int ans = 0;

    for(int i = 0; i < n; i++){
      for(int j = n; j > i; j--){
        if(Long.parseLong(s.substring(i, j)) % 2019 == 0){
          ans += 1;
        }
      }
    }

    System.out.println(ans);
  }
}
