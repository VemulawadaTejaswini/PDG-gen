import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int N;
      
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt(); //入力数
      
      int[][] int2Array;   //Int型の2次元配列intArrayを宣言
      int2Array = new int[2][N];  //N個のInt型データを持つ2次元配列intArrayを生成

      //入力数分、読み込んで配列に入れる

      //(1)初期値i=0、iがN以下の間forループ内を実行 配列に数値を入れる
      for(int i = 0; i < N; i++) {
        int2Array[0][i] = i+1;
        int2Array[1][i] = sc.nextInt();
      }

      
      //配列をクイックソートする
      quick_sort(int2Array, 0, N-1);


      for(int i = 0; i < N; i++) {
        System.out.println(int2Array[0][i]);
      }
      
      
    }

    // 配列dのleftからrightまでの間のデータ列をクイックソートする
    static void quick_sort(int[][] d, int left, int right) {
        if (left >= right) {
            return;
        }
        int partition = d[1][(left+right)/2];
        int L = left, R = right;
        int[] temp = new int[2] ; //2つの要素の配列を宣言
        while(L<=R) {
            while(d[1][L] < partition) { L++; }
            while(d[1][R] > partition) { R--; }
            if (L<=R) {
                temp[0] = d[0][L];
                temp[1] = d[1][L];
                
                d[0][L] = d[0][R];
                d[1][L] = d[1][R];
                
                d[0][R] = temp[0];
                d[1][R] = temp[1];
                
                L++; R--;
            }
        }
        quick_sort(d, left, R);  // ピボットより左側をクイックソート
        quick_sort(d, L, right); // ピボットより右側をクイックソート

    }

}