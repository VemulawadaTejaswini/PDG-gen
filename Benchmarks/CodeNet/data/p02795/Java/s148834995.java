import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        // 処理
        int out = 0;
        int l = h > w ? h : w;
        int syo = n / l;
        int amari = n % l;
        out = syo + (amari != 0 ? 1 : 0);

        // 出力
        System.out.println(out);
    }
}