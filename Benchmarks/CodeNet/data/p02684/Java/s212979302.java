import java.util.ArrayList;
import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 通った街を記録する配列
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);    // 一つ目の町

        // ループの先頭の町がリストの何番目にあるかを格納する変数
        int check = 0;

        // 転送先を格納する変数。
        int temp = 1;   // 計算のため初期値１

        for (int i = 0; i < n; i++) {
            temp = a[temp-1];   //　転送先設定

            // 訪れた町かチェック
            // 訪れていた場合、ループ前のイントロ部分の長さを求める
            if (list.contains(temp)) {
                check = list.indexOf(temp);
            	break;
            }
            list.add(temp);
        }

        // 合計移動回数をループ長で割った余りを求める
        int std = ((int)(k-check) % (list.size() - check));

        System.out.println(list.get(std + check));
    }
}