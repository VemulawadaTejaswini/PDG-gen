import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long nameLen = 0;
        String ans = "";

        //何文字かを判定
        //26^xで割り、結果が0になればxが文字数の長さ
        for (long i = 1; i < 1000000000; i++) {
            if (N / (long) Math.pow(26, i) == 0) {
                nameLen = i;
                break;
            }
        }

        //Nから26^文字数の値を引いた回数だけアルファベットを全探索
        //大きい桁の
        for (int i = (int) nameLen; i > 0; i--) {
            long concatChar = N / (long) Math.pow(26, i - 1);
            N = N % (long) Math.pow(26, i - 1);
            ans += String.valueOf((char) (96 + concatChar));
        }

        System.out.println(ans);

    }
}
