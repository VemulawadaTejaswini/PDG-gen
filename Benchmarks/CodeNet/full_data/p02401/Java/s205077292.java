import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner scan = new Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();
            int ans = 0;

            // (a op b)の形で読み込みたい
            if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            } else if (op.equals("*")) {
                System.out.println(a * b);
            } else if (op.equals("/")) {
                System.out.println(a / b);
            } else if (op.equals("?")) {// ?の時終了する。
                break;
            }
        }
    }
}
