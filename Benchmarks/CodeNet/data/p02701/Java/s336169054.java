import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * C - gacha
 * くじ引きを N 回行い、i 回目には種類が文字列 Si で表される景品を手に入れました。
 * 何種類の景品を手に入れましたか？
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // くじを引いた回数
        int n = sc.nextInt();
        // 入手した景品
        Set<String> s = new HashSet<>();

        for( int i = 0; i < n; i++ ) {
            s.add( sc.next() );
        }
        System.out.println( s.size() );

        sc.close();
    }
}