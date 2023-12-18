import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner ssc = new Scanner(System.in);
        int h = ssc.nextInt();
        int w = ssc.nextInt();
        int n = ssc.nextInt();
        int sr = ssc.nextInt();
        int sc = ssc.nextInt();
        
        String str = ssc.next();
        char[] sente = str.toCharArray();
        str = ssc.next();
        char[] gote = str.toCharArray();
        
        boolean win = false;
        // 左に落とせるか
        int max = w;
        int now = sc;
        for (int i = 0; i < n; i++) {
            if (sente[i] == 'L') now--;
            if (now == 0) win = true;
            if (gote[i] == 'R') now = Math.min(++now, max);
        }
        // 右に落とせるか
        int min = 1;
        now = sc;
        for (int i = 0; i < n; i++) {
            if (sente[i] == 'R') now++;
            if (now == w+1) win = true;
            if (gote[i] == 'L') now = Math.max(--now, min);
        }
        // 上に落とせるか
        max = h;
        now = sr;
        for (int i = 0; i < n; i++) {
            if (sente[i] == 'U') now--;
            if (now == 0) win = true;
            if (gote[i] == 'D') now = Math.min(++now, max);
        }
        // 下に落とせるか
        min = 1;
        now = sc;
        for (int i = 0; i < n; i++) {
            if (sente[i] == 'D') now++;
            if (now == h+1) win = true;
            if (gote[i] == 'U') now = Math.max(--now, min);
        }
        
        if (win) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
