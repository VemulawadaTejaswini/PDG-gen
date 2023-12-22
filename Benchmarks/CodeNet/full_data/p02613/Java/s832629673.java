import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      // 判定
      int countAC = 0;
      int countWA = 0;
      int countTLE = 0;
      int countRE = 0;
      for(int i = 0; i < N; i++){
        String ans = sc.next();
        if(ans.equals("AC")){
          countAC++;
        }
        else if(ans.equals("WA")){
          countWA++;
        }
        else if(ans.equals("TLE")){
          countTLE++;
        }
        else if(ans.equals("RE")){
          countRE++;
        }
      }
      
      
      // 出力
      System.out.println("AC x " + countAC);
      System.out.println("WA x " + countWA);
      System.out.println("TLE x " + countTLE);
      System.out.println("RE x " + countRE);
    }

}