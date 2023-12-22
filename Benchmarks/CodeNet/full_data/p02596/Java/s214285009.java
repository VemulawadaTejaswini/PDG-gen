import java.util.*;
  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ans = 0;
      int K = sc.nextInt();
      int[] A = new int[1000001];
      A[0]=7%K;
      for(int i=1; i<K; i++) {
        A[i]=(A[i-1]*10+7)%K; //ここまでで全てを終わらせる。
      } //とり合えずここで閉じて配列要素の閉じ込める。
      
      for(int i=1; i<K; i++) {
        if(A[i]==0) {
          System.out.println(i+1);
          //break; //ループを抜ける、かつ -1 も同時に出力してしまう。
          return; //ループを抜ける、かつ戻り値を返し出力を決定する。
        } 
      }
          System.out.println(-1);
    }
  }