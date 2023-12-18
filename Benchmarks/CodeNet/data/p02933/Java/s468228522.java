import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String s = sc.next();

        // 主処理
        String result = 3200 <= a ? s : "red";

        // 出力
        System.out.println(result);
        sc.close();
    }
}