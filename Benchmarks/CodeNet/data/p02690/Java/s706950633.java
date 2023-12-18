import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        // 入力受付
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 変数定義
        boolean fin = true;    // 終了判定
        int a=0;                 // aの総当たり用変数

        // 総当たり
        while(fin){
            for(int b=0;b<a;b++){
                int a5 = (int)Math.pow(a,5);
                int b5 = (int)Math.pow(b,5);

                // a^5 - b^5
                if(a5-b5==x){
                    // 答えを取得
                    System.out.println(a + " " + b);
                    // ループを抜ける
                    fin=false;
                    break;
                }
                // a^5 - (-b)^5
                else if(a5+b5==x){
                    // 答えを取得
                    System.out.println(a + " " + (-b));
                    // ループを抜ける
                    fin=false;
                    break;
                }
            }
            a++;
        }
    }
}