import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    
    // 入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Double as[] = new Double[n];
    int y = 0;
    while(sc.hasNext()){
      as[y] = sc.nextDouble();
      y++;
    }
    
    // ソート
    Arrays.sort(as);
    // 結果用のセット
    Set<Double> aSet = new HashSet<Double>(Arrays.asList(as)); 
    
    // 検索
    for(int i=0;i<n;i++){
      Double ai = as[i];
      if(ai * ai > as[n-1]){
        break;
      }
      while(ai <= as[n-1]){
        if(aSet.contains(ai)){
          aSet.remove(ai);
        }
        // 累乗
        ai = ai * as[i];
      }
    }
    // 出力
    System.out.println(aSet.size());
  }
}
