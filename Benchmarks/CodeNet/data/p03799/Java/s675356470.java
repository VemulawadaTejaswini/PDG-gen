import java.util.*;

public class Main {
    public static void main(String[] args){
        String result = "";
        Scanner sc = new Scanner(System.in);
        // 整数Nの入力
        int n = sc.nextInt();
        // 整数Mの入力
        int m = sc.nextInt();
        if (n * 2 < m) {
            result = String.valueOf((n + (m - n * 2) / 4));
        } else {
            result = String.valueOf(m / 2);
        }
        // 出力
        System.out.println(result);
    }
}