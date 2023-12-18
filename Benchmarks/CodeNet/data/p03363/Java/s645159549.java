import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(sc.next());

        final int[] s = new int[N+1];
        final Map<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < N; i++) s[i+1] = s[i] + a[i];
        for (int i = 0; i < N+1; i++) nums.put(s[i], 0);
        for (int i = 0; i < N+1; i++) nums.put(s[i], nums.get(s[i])+1);

        for (int i : s) {
            System.out.println(i);
        }

        int ans = 0;
        for (Map.Entry entry : nums.entrySet()) {
            int num = (int) entry.getValue();
            ans += num * (num-1) / 2;
        }

        System.out.println(ans);
    }
}
