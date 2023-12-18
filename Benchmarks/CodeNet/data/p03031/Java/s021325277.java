import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);// スイッチの種類
        int m = Integer.parseInt(nm[1]);// 電球の数

        List<List<Integer>> k = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> ele = new ArrayList<>();
            String[] a = sc.nextLine().split(" ");
            for (int j = 1; j < a.length; j++) {
                ele.add(Integer.valueOf(a[j]) - 1);
            }
            k.add(ele);
        }
        List<Integer> p = new ArrayList<>();
        for (String s : sc.nextLine().split(" ")) {
            p.add(Integer.valueOf(s));
        }

        int ans = 0;
        for (int i = 0; i < (Math.pow(2, n)); ++i) {
            boolean ok = true;
            for (int j = 0; j < m; ++j) {
                int c = 0;
                for (int id : k.get(j)) {
                    if ((1 & i >> id) == 1) {
                        ++c;
                    }
                }
                c %= 2;
                if (c != p.get(j)) {
                    ok = false;
                }
            }
            if (ok) {
                ++ans;
            }
        }
        System.out.println(ans);
    }
}