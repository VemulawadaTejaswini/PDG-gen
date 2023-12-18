import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();
      
      // 算出
      int[] dist = new int[N];
      for(int i = 0; i < N; i++){
        dist[i] = 0;
      }
      
      for(int i = 1; i <= N-1; i++){
        for(int j = i+1; j <= N; j++){
          int index = getDistance(i, j, X, Y);
          dist[index]++;
        }
      }
      
      // 出力
      for(int i = 1; i < N; i++){
        System.out.println(dist[i]);
      }
    }
    
    // 2頂点間の最短距離を求める関数
    public static int getDistance(int p1, int p2, int X, int Y){
      // 近道を使用しない場合の距離
      int dist1 = p2 - p1;
      
      // 近道を使用する場合の距離
      int dist2 = abs(X - p1) + abs(Y - p2) + 1;
      
      if(dist1 < dist2){
        return dist1;
      }else{
        return dist2;
      }
    }
    
    // 絶対値を求める関数
    public static int abs(int num){
      if(num < 0){
        return num * (-1);
      }else{
        return num;
      }
    }

}