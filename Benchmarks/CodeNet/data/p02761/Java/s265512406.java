import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        boolean ok = true;
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            int v = map.getOrDefault(s, -1);
            if (v == -1 || v == c) {
                map.put(s, c);
            } else {
                ok = false;
            }
        }
        if (!ok) {
            System.out.println(-1);
            return;
        }
        if (M == 0) {
            String ans = "1";
            while (--N > 0) {
                ans = ans + "0";
            }
            System.out.println(ans);
            return;
        }

        if (map.getOrDefault(1, -1) == 0) {
            System.out.println(-1);
            return;
        }

        String ans = "";
        int n = N;
        while (n > 0) {
            if (n == 1 && map.getOrDefault(1, -1) == -1) {
                ans = "1" + ans;
            } else {
                ans = map.getOrDefault(n, 0) + ans;
            }
            n--;
        }
        int ansInt = Integer.parseInt(ans);
        
        System.out.println(ansInt == 0 ? -1 : ansInt);
    }
}
