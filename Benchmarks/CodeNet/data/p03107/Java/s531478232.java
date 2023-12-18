import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int zero = 0; // 赤の個数
        int one = 0; // 青の個数
        for (int i = 0; i < S.length(); i++) { // 個数を数える
            if (S.charAt(i) == '0') zero++;
            else one++;
        }
        System.out.println(Math.min(zero, one) * 2);
    }
}
