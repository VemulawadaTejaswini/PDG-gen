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
 
      
      int[] temp = new int[2] ; //2つの要素の配列を宣言
      //配列をバブルソートする
      for(int i = 0; i < N; i++) {
        for(int j = N-1; j >= i+1; j--) {
 
          if(int2Array[1][j-1] > int2Array[1][j]) {
 
            temp[0] = int2Array[0][j];
            temp[1] = int2Array[1][j];
            
            int2Array[0][j] = int2Array[0][j-1];
            int2Array[1][j] = int2Array[1][j-1];
 
            int2Array[0][j-1] = temp[0];
            int2Array[1][j-1] = temp[1];
 
          }
        }
      }
      
      for(int i = 0; i < N; i++) {
        System.out.println(int2Array[0][i]);
      }
      
      
    }
}