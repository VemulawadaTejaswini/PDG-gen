import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        
        // que: ルンルン数(次の桁に-1～+1で行ける)
        // ex. 334, 2123, 3234566667
        Queue<String[]> que = new ArrayDeque<String[]>();
        
        // 1～9からBFSスタート
        for (int i = 1; i <= 9; i++) {
            String tmp = String.valueOf(i);
            que.add(new String[]{tmp, "1"});
        }
        
        // count: キューから出した回数
        int count = 0;
        while (!que.isEmpty()) {
            String[] curtmp = que.poll();
            String cur = curtmp[0];
            int nonzero = Integer.parseInt(curtmp[1]);
            
            // System.out.println(cur);
            
            if (cur.length() < n.length()) {
                if (nonzero == k) {
                    int remain = n.length() - cur.length();
                    count += remain;
                    
                    while (remain-- > 0) {
                        cur += "0";
                    }
                    
                    que.add(new String[]{cur, String.valueOf(nonzero)});
                    continue;
                    // System.out.println(cur);
                }
            } else if (cur.length() == n.length()) {
                if (nonzero != k) continue;
                
                // n以下かどうか
                boolean under = true;
                for (int i = 0; i < n.length(); i++) {
                    if (cur.charAt(i) < n.charAt(i)) {
                        break;
                    } else if (cur.charAt(i) > n.charAt(i)) {
                        under = false;
                        break;
                    }
                }
                
                if (under) {
                    count++;
                    // System.out.println(cur);
                }
                continue;
            }
            
            // 次の桁のパターンをキューに入れる
            for (int i = 0; i <= 9; i++) {
                String tmp = String.valueOf(i);
                
                if (i == 0) {
                    que.add(new String[]{cur + tmp, String.valueOf(nonzero)});
                } else {
                    que.add(new String[]{cur + tmp, String.valueOf(nonzero + 1)});
                }
            }
        }
        System.out.println(count);
    }
}