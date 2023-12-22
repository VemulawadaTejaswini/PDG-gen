import java.util.Scanner;

/**
 * A - Calc
 * 整数 a が入力されます。
 * 値 a+a2+a3 を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();

        System.out.println( ( int ) ( a + Math.pow( a, 2) + Math.pow( a, 3 ) ) );

        sc.close();
    }
}
