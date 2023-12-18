import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        solve2(sc, N);
    }

    private static void solve2(Scanner sc, int N) {
        System.out.println(0);
        String leftString = sc.next();
        if (leftString.equals("Vacant")) {
            return;
        }

        int left = 0;
        int right = N;
        while (true) {
            int mid = (left+right)/2;
            int numLeft = mid - left + 1;
            System.out.println(mid);
            String ans = sc.next();
            if (ans.equals("Vacant")) return;

            if ((numLeft)%2 == 0 && leftString.equals(ans)
                    || (numLeft)%2 != 0 && !leftString.equals(ans)) {
                // 偶数個なら左右が同一だと交互に配置できないのでこの領域に空席がある
                // 奇数個なら左右が異なると交互に配置できないのでこの領域に空席がある
                // この場合探索領域を左半分に絞ってよい
                right = mid;
            } else {
                // それ以外なら探索領域を右半分に絞ってよい
                leftString = ans;
                left = mid;
            }
        }
    }
}