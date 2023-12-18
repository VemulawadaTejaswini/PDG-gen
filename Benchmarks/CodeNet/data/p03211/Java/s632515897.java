import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int end = str.length() - 3;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= end; i++) {
            String tmp = str.substring(i, i + 3);
            int toInt = Integer.parseInt(tmp);
            // 753が存在する場合は終了
            if (tmp.equals("753")) {
                System.out.println(0);
                return;
            }
            if (Math.abs(753 - toInt) < ans) {
                ans = Math.abs(753 - toInt);
            }
        }
        System.out.println(ans);
    }
}
