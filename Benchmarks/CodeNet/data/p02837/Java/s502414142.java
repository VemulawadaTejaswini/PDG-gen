import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);
    Map<Integer, List<Evidence>> map;
    int n;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        n = sc.nextInt();
        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            List<Evidence> evidences = new ArrayList<>();
            for (int j = 0; j < a; j++) {
                int x = sc.nextInt()-1;
                int y = sc.nextInt();
                evidences.add(new Evidence(x, y));
            }
            map.put(i, evidences);
        }

        int ans = 0;
        for (int i = 0; i < 1 << n; i++) {
            int cnt = check(i);
            ans = Math.max(cnt, ans);
        }
        System.out.println(ans);
    }

    private int check(int i) {
        int cnt = 0;
        for (int j = 0; j < n; j++) {
            // 正直者ではない人の証言は無視
            if (( 1 & i >> j) == 0) continue;

            cnt++;
            for (Evidence evidence : map.get(j)) {
                if ((1 & i >> evidence.x) != evidence.y) return -1;
            }
        }
        // 最後の人まで矛盾なくいければ正直者の人数を返す
        return cnt;
    }

    class Evidence {
        int x;
        int y;

        public Evidence(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
