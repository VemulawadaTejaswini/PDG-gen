import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int varN = Integer.parseInt(sc.next());
        long[] varA = new long[varN];
        for (int i = 0; i < varN; i++) {
            varA[i] = Long.parseLong(sc.next());
        }
        sc.close();
        long result = 0;
        //  変換文字列分比較をする
        for (int j = 0; j < varN; j++) {
            for (int k = j + 1; k < varN; k++) {
                result = result + (varA[j] * varA[k]);
            }
        }

        result = result % 1000000007;
        System.out.println(result);
    }
}