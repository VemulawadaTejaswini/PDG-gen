import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int countR = s.replaceAll("[^R]", "").length();
        int countB = s.replaceAll("[^B]", "").length();
        int countG = s.replaceAll("[^G]", "").length();
        int countAll = countR * countB * countG;

        int countDel = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int k = j + (j - i);
                if (k < n) {
                    char leftC = s.charAt(i);
                    char rigthC = s.charAt(j);
                    char centerC = s.charAt(k);
                    if (leftC != centerC && centerC != rigthC && leftC != rigthC) {
                        countDel++;
                    }
                }
            }
        }

        int result = countAll - countDel;

        // 出力
        System.out.println(result);
    }
}
