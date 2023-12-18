import java.util.Scanner;

/**
 * D - Brick Break
 * N 個のレンガが横一列に並んでいます。
 * 左から i (1≤i≤N) 番目のレンガには、整数 ai が書かれています。
 * あなたはこのうち N−1 個以下の任意のレンガを選んで砕くことができます。
 * その結果、K 個のレンガが残っているとします。
 * このとき、任意の整数 i (1≤i≤K) について、残っているレンガの中で左から i 番目のものに書かれた整数が i であるとき、すぬけさんは満足します。
 * すぬけさんが満足するために砕く必要のあるレンガの最小個数を出力してください。
 * もし、どのように砕いてもそれが不可能な場合、代わりに -1 を出力してください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();   // レンガの数
        int[] a = new int[n];

        boolean judgement = false;
        int breakCnt = 0;   // 壊したレンガのカウント用
        int brickTemp = 0;   // 現在の残すレンガの数仮置き
        for( int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
            if( a[i] == 1 ) {
                judgement = true;
                brickTemp = 1;
            }

            // すでに1を確認している場合
            if( judgement ) {
                if( a[i] == brickTemp + 1 ) brickTemp = a[i];
                else breakCnt++;
            }
            else {
                breakCnt++;
            }
        }

        // 1がない場合、不可能なので-1を返却
        System.out.println( judgement ? breakCnt - 1 : -1 );

        sc.close();
    }
}