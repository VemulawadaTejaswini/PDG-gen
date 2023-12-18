import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    //ラウンド開始時のポイント
    int K = sc.nextInt();
    //正解数
    int Q = sc.nextInt();
    int[] point = new in[N];
    for(int i=0; i<Q; i++){
      int ansNum = sc.nextInt();
      for(int i=0; i<N; i++){
        if(ansNum - 1 == i)continue;
        point[i]--;
      }
    }
    for(int i=0; i<N; i++){
      if(point[i]>0)System.out.println("Yes");
      else System.out.println("No");
    }
  }
}