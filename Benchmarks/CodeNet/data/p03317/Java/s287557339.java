import java.util.*;

public class Main {
  public static void main(String[] args) {
      
    // 標準入力から値を取得してinputに入れる
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();       // データ数
    int K = sc.nextInt();       // 移動範囲
    int smallestNum = 1;   // 最小値
    int operationNum = 0;  // 操作回数
    ArrayList<Integer> numData = new ArrayList<Integer>();
    
    for (int i = 0; i < N; i++) {
      numData.add(sc.nextInt());
    }
    
    // 最小値の場所を検索
    int smallNumAddress = numData.indexOf(smallestNum);
    
    // 開始位置を検索
    if (smallNumAddress < K || N - smallNumAddress <= K) {
      operationNum = (N - 1) / (K - 1);
      if ((N - 1) % (K - 1) != 0) {
        operationNum += 1;
      }
      
    } else {
      operationNum = (smallNumAddress / (K - 1)) + 
                       ((N - smallNumAddress - 1) / (K - 1));
      
      if (smallNumAddress % (K - 1) != 0) {
        operationNum += 1;
      }
      if ((N - smallNumAddress - 1) % (K - 1) != 0) {
        operationNum += 1;
      }
      
    }
    
    System.out.println(operationNum);
    sc.close();
  }
}
