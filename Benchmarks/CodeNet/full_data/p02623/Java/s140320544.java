import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //一段目の値の取得
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        //二段目の値(机Aの1,2,3番目の本の読了所要時間)の取得
        int a[] = new int[N];
        for(int i = 0; i < N; ++i) {
            a[i] = sc.nextInt();
        }
        //三段目の値(机Bの1,2,3,4番目の本の読了所要時間)の取得
        int b[] = new int[M];
        for(int i　= 0; i < M; ++i) {
            b[i] = sc.nextInt();
        }

        //残り時間が0以下になるまで繰り返す
        int count = 0;
        int i = 0;
        int remainingTime = K;
        while(remainingTime < 0) {
            //AかBどちらかの机を選択
           String[] selectDesk = {"A", "B"};
           int readTime = 0;
           
            //選択した机の一番上の本の読了所要時間を取得
           if (selectDesk[i] == "A"){
                readTime = a[i];
                ++i;
            } else {
                readTime = b[i];
                ++i;
            }

            //残り時間を計算
            remainingTime -= readTime;
            
            ++count;
        }
        
        //K分以内に読むことができる本の最大数を出力
        System.out.println(count - 1);
    }
}