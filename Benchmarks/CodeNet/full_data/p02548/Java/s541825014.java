import java.util.*;
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int AB = 0;
      int ans = 0;
      //N-CをC=1からループし、その値を満たすA*Bを計算する
      for(int C = 1; C <= N-1; C++){
        AB = N-C;
        for(int A =1; A <= AB; A++){
            if(AB%A == 0){
                ans += 1;
            }
        }
      }
    
      System.out.println(ans);   
  }
}