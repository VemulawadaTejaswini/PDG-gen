import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int cnt = 0;  
      for(int i = 1; i <= n; i+=2) {
        int curCnt = 0;
        for(int j = 1; j * j <= i; j++) {
          if(i % j == 0) {
            if(i % j != j) curCnt += 2;
            else curCnt += 1;
          }
        }
        
        if(curCnt == 8) {
            cnt++;
        }
      }
      System.out.println(cnt);
  }
}