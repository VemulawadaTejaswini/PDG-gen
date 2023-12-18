import java.util.Scanner;

/**
 * C - Maximum Volume
 * 正の整数 L が与えられます。
 * 縦、横、高さの長さ (それぞれ、整数でなくてもかまいません) の合計が L の直方体としてありうる体積の最大値を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 正の整数
        int l = sc.nextInt();

        System.out.println( String.format( "%f", Math.pow( l / 3, 3 ) ) );

        sc.close();
    }
}