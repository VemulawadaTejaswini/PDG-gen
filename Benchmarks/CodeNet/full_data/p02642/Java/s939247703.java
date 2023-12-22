import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    
    // 入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    // 入力値の読み込み
    List<Integer> aList = new ArrayList<Integer>();
    while(sc.hasNext()){
      aList.add(sc.nextInt());
    }
    
    // 数字を検索する
    int i = 1;
    int x = 0; // 返却値
    for(int ai:aList){
      boolean flg = false;
      for(int aj:aList){
        if(ai == aj){
          // 同じ場合はスキップ
          continue;
        }
        if(ai % aj != 0 ){
          flg = true;
        }else{
          // 割り切れる場合は次の数字へ
          flg = false;
          break;
        }
      }
      if(flg){
        // iを数える
        x++;
      }
      if(i == n){
        break;
      }
      i++;
    }
    
    // 出力
    System.out.println(x);
  }
}