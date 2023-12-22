import java.util.Scanner;

/*
英大文字 P および D からなる文字列 S について、
S が連続する部分文字列として含む D および PD の個数の和を
S の「博士・PD 指数」と呼びます。
例えば S= PPDDP のとき、S は連続する部分文字列として
2 個の D と 1 個の PD を含んでいるので、
S の博士・PD 指数は 3 です。

P, D, ? からなる文字列 T があります。

T に含まれる ? をそれぞれ P または D のいずれかで置き換えてできる文字列の中で、
博士・PD 指数が最大のものを 1 つ求めてください。

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String t = sc.next();

        String[] temp = t.split("");

        String ans = "";
        String exa = "";

        for (int i = 0; i < t.length(); i++) {
            String flg = temp[i];
            if (!flg.equals("?")) {
                exa = flg;
                ans += flg;
                continue;

            }
            if (i == 0) {
            	if (flg.equals("?")) {
                    flg = "D";
                    exa = flg;
                    ans += flg;
                }
            }
            if (exa.equals("P")) {
                ans += "D";
                exa = "D";
            } else {
                ans += "P";
                exa = "P";
            }
        }

        System.out.println(ans);
    }
}