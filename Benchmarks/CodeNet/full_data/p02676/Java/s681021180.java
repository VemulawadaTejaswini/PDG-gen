import java.util.Scanner;

/*
問題文
英小文字からなる文字列 S があります。
S の長さが K 以下であれば、S をそのまま出力してください。

S の長さが K を上回っているならば、先頭 K 文字だけを切り出し、末尾に ... を付加して出力してください。

制約
K は 1 以上 100 以下の整数
S は英小文字からなる文字列
S の長さは 1 以上 100 以下

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        if (s.length() <= k) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, k) + "...");
        }
    }
}