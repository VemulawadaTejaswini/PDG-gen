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
        for (int i = 1; i < n - 1; i++) {
            int left = i - 1;
            int right = i + 1;
            while (0 <= left && right < n) {
                char leftC = s.charAt(left);
                char rigthC = s.charAt(right);
                char centerC = s.charAt(i);
                if (leftC != centerC && centerC != rigthC && leftC != rigthC) {
                    countDel++;
                }
                left--;
                right++;
            }
        }

        int result = countAll - countDel;

        // 出力
        System.out.println(result);
    }
}
