import java.util.Scanner;

/**
 * A - Coffee
 * ある長さ 6 の英小文字からなる文字列がcoffeeに似ているとは、3 文字目と 4 文字目が等しく、5 文字目と6 文字目も等しいことを言います。
 * 与えられる文字列 S がcoffeeに似ているか判定してください。
 * Sは長さ6文字からなる英小文字。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力された文字列
        String s = sc.next();
        // 文字列の3,4文字目が同一英字、5,6文字目が同一英字であるかを判定
        if( s.charAt( 2 ) == s.charAt( 3 ) && s.charAt( 4 ) == s.charAt( 5 ) ) {
            System.out.println( "Yes" );
        }
        else {
            System.out.println( "No" );
        }

        sc.close();
    }
}