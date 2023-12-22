import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        // type: コンテスト種類数
        int type = 26;
        
        // n: 1～n日目まで開催
        int n = sc.nextInt();
        
        // c[t]: コンテストtのマイナス係数
        int[] c = new int[type];
        for (int i = 0; i < type; i++) {
            c[i] = sc.nextInt();
        }
        
        // s[d][t]: コンテストtをd日目に開くと増加する満足度
        int[][] s = new int[n+1][type];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < type; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        
        // last[t]: コンテストtが最近何日目に開催されたか
        ArrayList<Integer>[] list = new ArrayList[type];
        for (int i = 0; i < type; i++) {
            list[i] = new ArrayList<Integer>();
        }
        
        // t[d]: d日目に開催するコンテストは何か
        int[] t = new int[n+1];
        for (int i = 1; i <= n; i++) {
            Random random = new Random();
            int randomValue = random.nextInt(type);
            t[i] = randomValue;
            list[t[i]].add(i);
        }
        
        // 計算部分(1日ずつ)
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            // 開催するコンテストを選択
            int contest = t[i];
            list[contest].add(i);
            
            // 満足度上昇
            ans += s[i][contest];
            
            // // 満足度減少
            // for (int j = 0; j < type; j++) {
            //     ans -= c[j] * (i - last[j]);
            // }
        }
        
        // 満足度減少は後から計算
        for (int i = 0; i < type; i++) {
            int tmp = n * (c[i] + c[i] * n) / 2;
            
            int prev = 0;
            for (int j = 0; j < list[i].size(); j++) {
                int now = list[i].get(j);
                tmp -= c[i] * (now - prev) * (n - now + 1);
                
                prev = now;
            }
            
            ans -= tmp;
        }
        
        // m: 変更クエリ数
        int oldans = ans;
        int m = 90000;
        while (m-- > 0) {
            Random random = new Random();
            int randomValue = random.nextInt(n);
            int d = randomValue + 1;
            
            randomValue = random.nextInt(type);
            int q = randomValue;
            while (q == t[d]) {
                randomValue = random.nextInt(type);
                q = randomValue;
            }
            
            // d日目を削除
            int contest = t[d];
            int prev = 0;
            for (int i = 0; i < list[contest].size(); i++) {
                if (list[contest].get(i) == d) {
                    if (i != 0) {
                        prev = list[contest].get(i-1);
                    }
                    list[contest].remove(i);
                    break;
                }
            }
            
            // 削除の計算
            int tmp = c[contest] * (d - prev) * (n - d + 1);
            ans -= tmp;
            ans -= s[d][contest];
            
            // d日目を追加
            ArrayList<Integer> oldlist = (ArrayList<Integer>) list[q].clone();
            list[q].add(d);
            list[q].sort(Comparator.naturalOrder());
            t[d] = q;
            
            // 追加の計算
            prev = 0;
            for (int i = 0; i < list[q].size(); i++) {
                if (list[q].get(i) == d) {
                    if (i != 0) {
                        prev = list[q].get(i-1);
                        break;
                    }
                }
            }
            tmp = c[q] * (d - prev) * (n - d + 1);
            ans += tmp;
            ans += s[d][q];
            
            // 判定
            if (ans > oldans) {
                t[d] = q;
                oldans = ans;
            } else {
                list[contest].add(d);
                list[contest].sort(Comparator.naturalOrder());
                list[q] = oldlist;
                ans = oldans;
            }
            // System.out.println(ans);
        }
        
        // 出力
        for (int i = 1; i <= n; i++) {
            System.out.println(t[i]);
        }
    }
}
