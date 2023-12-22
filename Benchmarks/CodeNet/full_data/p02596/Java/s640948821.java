import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Integer> S = new HashSet();
        int ans = -1;
        int cnt = 0;
        for (int sum = 0; true; ) {
            cnt++;
            sum = (sum * 10 + 7) % n;
            if (sum % n == 0) {
                ans = cnt;
                break;
            }
            if (S.contains(sum)) break;
            S.add(sum);
        }
        System.out.println(ans);
    }
}
