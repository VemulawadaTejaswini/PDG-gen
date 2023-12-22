import java.util.Scanner;

/**
 * C - Step
 * N  人が 1 列に並んでおり、前から i 番目の人の身長は Ai です。
 * それぞれの人の足元に、高さが 0 以上の踏み台を設置し、全ての人が次の条件を満たすようにしたいです。
 * 条件：踏み台を込めて身長を比較したとき、自分より前に、自分より背の高い人が存在しない
 * この条件を満たす時の、踏み台の高さの合計の最小値を求めてください。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int n = sc.nextInt();
        int[] a = new int[n];

        int result = 0;
        for( int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
            if( i > 0 && a[i] < a[i - 1] ) {
                int add = a[i - 1] - a[i];
                result += add;
                a[i] = a[i] + add;
            }
        }

        System.out.println( result );

        sc.close();
    }
}