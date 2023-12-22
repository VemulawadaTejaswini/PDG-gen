import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    // 入力
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); 
    int n = sc.nextInt();
    int answer = x; // 返却値
    
     // nが0のとき
    if(n == 0){
      System.out.println(answer);
      return;
    }
    
    // 入力値の読み込み
    int ps[] = new int[n];
    int i = 0;
    while(sc.hasNext()){
      ps[i] = sc.nextInt();
      i++;
    }
    
    // ソート
    Arrays.sort(ps);
    
    // Xのインデックスを取得
    int xIndex = 0;
    for(int a = 0;a < n ; a ++){
      if(ps[a] == x){
        xIndex = a;
        break;
      }
    }
    
    // 数字を検索する
    for(int a = 1;a < n ; a ++){
      if(ps[xIndex - a] != x - a){
        answer = x - a;
        break;
      }
      if(ps[xIndex + a] != x + a){
        answer = x + a;
        break;
      }
    }
    // 出力
    System.out.println(answer);
  }
}