import java.util.Scanner;

/**
 * A - Transfer
 * 容器 1 には水を A ミリリットルまで入れることができ、水が B ミリリットル入っています。
 * 容器 2 には水が C ミリリットル入っています。
 * 容器 2 から容器 1 に入るだけ水を移します。
 * 容器 2 の中には何ミリリットルの水が残るでしょうか。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 1の容器の容量
        int a = sc.nextInt();
        // 1の容器に入っている水の量
        int b = sc.nextInt();
        // 2の容器に入っている水の量
        int c = sc.nextInt();

        int add = a - b;
        if( c >= add ) {
            System.out.println( c - add );
        }
        else {
            System.out.println( 0 );
        }

        sc.close();
    }
}