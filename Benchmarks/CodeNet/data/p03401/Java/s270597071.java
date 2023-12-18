import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 要素を取得
    int n = sc.nextInt();
    ArrayList<Integer> map = new ArrayList<Integer>();
    map.add(0);
    for(int i =0; i < n ; i++){
      int tmp = sc.nextInt();
      map.add(tmp);
    }
    map.add(0);
    // 移動距離と合計を計算
    for(int j = 1; j <= n; j++){
      ArrayList<Integer> removedMap = new ArrayList<Integer>();
      for(Integer tmp: map){
        removedMap.add(tmp);
      }
      // 対象要素を除外
      removedMap.remove(j);
      Integer sum = 0;
      for(int l = 0; l < removedMap.size()-1; l++){
        sum = sum + Math.abs(removedMap.get(l)-removedMap.get(l+1)) ;
      }
      System.out.println(sum);
    }
  }
}