import java.util.Scanner;

/*
問題文
高橋くんはAtCoder銀行に 100 円を預けています。
AtCoder銀行では、毎年預金額の 1 % の利子がつきます(複利、小数点以下切り捨て)。

利子以外の要因で預金額が変化することはないと仮定したとき、高橋くんの預金額が初めて
X 円以上になるのは何年後でしょうか。

制約
101≤X≤10^18
入力はすべて整数
*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double def = 100;
        long x = sc.nextLong();

        boolean flg = true;
        int count = 0;
        while(flg) {
            def = Math.floor(1.01 * def);
            count++;
            if (x <= def) {
                flg = false;
            }
        }

        System.out.println(count);
    }
}