import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    boolean tmp = true;

    while(tmp){
      int n = sc.nextInt();
      int x = sc.nextInt();
      int ans = 0;

      if(n == 0 && x == 0){
        tmp = false;
        break;
      }

      for(int i = 1; i < n; i++){
        for(int j = i + 1; j < n + 1; j++){
          if(x - i - j > j && x - i - j < n + 1){
            ans += 1;
          }
        }
      }

      System.out.println(ans);
    }
  }
}

