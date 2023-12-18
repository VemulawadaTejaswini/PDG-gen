import java.util.*;

public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] P = new int[N];
       for (int i = 0; i < N; ++i) {
            P[i] = sc.nextInt();
       }
       
       int count = 0; //条件を満たす整数のカウント
       int Pj = P[0]; //P[j]を設定　はじめはP[0]の値から
       
       for(int i = 0; i < N; ++i) {
             if(P[i] <= Pj) {
               ++count;
               Pj = P[i]; //P[j]にP[i]の値を代入
           }
       }
       
       //出力
       System.out.println(count);
       
    }
}