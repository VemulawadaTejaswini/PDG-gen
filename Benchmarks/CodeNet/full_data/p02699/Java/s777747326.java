import java.util.Scanner;

/**
 * A - Sheep and Wolves
 * 羊が S 匹、狼が W 匹います。
 * 狼の数が羊の数以上のとき、羊は狼に襲われてしまいます。
 * 羊が狼に襲われるなら unsafe、襲われないなら safe を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 羊の数
        int s = sc.nextInt();
        // 狼の数
        int w = sc.nextInt();

        System.out.println( s > w ? "safe" : "unsafe" );

        sc.close();
    }
}