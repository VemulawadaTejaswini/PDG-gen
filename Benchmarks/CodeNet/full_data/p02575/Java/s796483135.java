import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // 問題:
        // 1. (H+1)*Wのboardがある
        // 2. 最初(0,0)(0,1)...(0,W)に人がいる
        // 3. 右or下に進める
        // 4. i行目には区間[L,R]の壁があり下には行けない
        
        // ans[i]: i行目に到達する人のうち、最小の歩数
        
        // map(now, from): 最初fromにいて、今nowにいる人らの集合
        SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < w; i++) {
            map.put(i, i);
        }
        
        // gaps: mapの(now-from)の集合
        TreeMap<Integer, Integer> gaps = new TreeMap<Integer, Integer>();
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            int gap = key-val;
            
            int cnt = gaps.getOrDefault(gap, 0);
            gaps.put(gap, ++cnt);
        }
        
        for (int i = 1; i <= h; i++) {
            int L = sc.nextInt()-1;
            int R = sc.nextInt()-1;
            
            // submap: 壁で下に行けない人の集合(R+1列目のまっすぐ行ける人も含む)
            SortedMap<Integer, Integer> submap = map.subMap(L, R+1);
            
            // (次の行,R+1)に最小で行ける人は、submapの一番右の人なので、
            // それ以外は削除する
            if (!submap.isEmpty()) {
                int val = 0;
                int right_now = submap.lastKey();
                int right_from = submap.get(right_now);
                
                // gapsの削除
                for (Integer key : submap.keySet()) {
                    val = map.get(key);
                    int gap = key-val;
                    
                    int cnt = gaps.getOrDefault(gap, 0);
                    if (cnt == 1) {
                        gaps.remove(gap);
                    } else {
                        gaps.put(gap, --cnt);
                    }
                }
                
                // mapの削除
                submap.clear();
                
                // map(now, right_from)のnowの更新
                int now = R+1;
                if (now < w) {
                    map.put(now, right_from);
                }
                
                // gapsの追加
                if (now < w) {
                    val = gaps.getOrDefault(now - right_from, 0);
                    gaps.put(now - right_from, ++val);
                }
                // System.out.println(map.toString());
                // System.out.println(gaps.toString());
                // System.out.println(now-right);
            }
            
            // ans: 縦移動+横移動
            int ans = -1;
            if (!map.isEmpty()) {
                ans = i + gaps.firstKey();
            }
            System.out.println(ans);
        }
    }
}
