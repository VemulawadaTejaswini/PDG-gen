import java.util.Scanner;

/**
 * A - AC or WA
 * 高橋君は、プログラミングコンテスト AXC001 に参加しており、問題 A にコードを提出しました。
 * この問題には N 個のテストケースがあり、すべてのテストケースに正解した場合のみ提出は AC となります。
 * 高橋君の提出は、N 個のテストケースのうち M 個のテストケースに正解しました。
 * 高橋君の提出が AC となるか判定してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力された整数N
        int n = sc.nextInt();
        // 入力された整数M
        int m = sc.nextInt();

        if( m < n ) {
            System.out.println( "No" );
        }
        else {
            System.out.println( "Yes" );
        }

        sc.close();
    }
}