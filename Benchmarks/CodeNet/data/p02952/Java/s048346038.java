import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();
      int count = 0;
      
      //桁数を取得する
      for(int i=1; i<=N; i++){
        int V = String.valueOf(i).length();
        
       //桁数が奇数のときカウント
        if(V%2!=0){
        	count++;
        }
      }
      //出力
      System.out.println(count);
    }
}