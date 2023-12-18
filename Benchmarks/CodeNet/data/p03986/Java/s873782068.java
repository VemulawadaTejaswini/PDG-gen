import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        sc.close();

        // 主処理
        int result = x.length();
        if (x.contains("ST")) {
            String st = x.replaceAll("^T+S", "S").replaceAll("TS+$", "T");
            int countS = st.replaceAll("[^S]", "").length();
            int countT = st.replaceAll("[^T]", "").length();
            int minus = Math.min(countS, countT);
            result -= minus * 2;
        }

        // 出力
        System.out.println(result);
    }
}
