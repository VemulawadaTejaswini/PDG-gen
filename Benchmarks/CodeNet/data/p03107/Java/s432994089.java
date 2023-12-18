import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String deleted = s;
        int l = deleted.length();
        boolean doContinue = true;
        while (doContinue) {
            deleted = deleted.replace("01", "").replace("10", "");
            int newL = deleted.length();
            doContinue = l != newL;
            l = newL;
        }
        int result = s.length() - l;

        // 出力
        System.out.println(result);
        sc.close();
    }
}