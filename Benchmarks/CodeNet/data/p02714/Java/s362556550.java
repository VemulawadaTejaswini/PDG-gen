import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        long countR = s.replaceAll("[^R]", "").length();
        long countG = s.replaceAll("[^G]", "").length();
        long countB = s.replaceAll("[^B]", "").length();
        long count = countR * countG * countB;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int k = j + (j - i);
                if (k < n) {
                    int c1 = s.charAt(i);
                    int c2 = s.charAt(j);
                    int c3 = s.charAt(k);
                    if (c1 != c2 && c1 != c3 && c2 != c3) {
                        count--;
                    }
                }
            }
        }
        long result = count;

        // 出力
        System.out.println(result);
    }
}
