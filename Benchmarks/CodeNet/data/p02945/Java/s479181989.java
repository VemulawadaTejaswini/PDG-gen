import java.util.Scanner;

/**
 * A - +-x
 * 整数 A, Bがあります。
 * A+B,  A−B,  A×B の中で最大の数を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();

        int addition = ( a + b );       // 加算
        int subtraction = ( a - b );    // 減算
        int multiplication = ( a * b ); // 乗算
        int max = addition;

        if( subtraction > addition ) max = subtraction;
        if( multiplication > addition ) max = multiplication;
        System.out.println( max );
    }
}