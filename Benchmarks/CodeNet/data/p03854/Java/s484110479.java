import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[][] candidate = {{'d', 'r', 'e', 'a', 'm', 'e', 'r'}, {'e', 'r', 'a', 's', 'e', 'r'}, {'d', 'r', 'e', 'a', 'm'}, {'e', 'r', 'a', 's', 'e'}};

        int i = 0;
        boolean isSuccess = false;
        Deque<Integer> q = new ArrayDeque<>();
        int nextK = -1;
        while(true) {
            for(int k = 0;k < 4;k++) {
                int tmp = candidate[k].length;
                if(tmp + i > s.length) continue;

                boolean isSame = true;
                for(int l = 0;l < tmp;l++) {
                    if(s[l + i] != candidate[k][l]) {
                        isSame = false;
                        break;
                    }
                }
                if(isSame) {
                    if(i + candidate[k].length != s.length) q.offer(k);
                    else {
                        q.clear();
                        i += candidate[k].length;
                        break;
                    }
                }
            }

            if(q.isEmpty()) {
                isSuccess = i == s.length;
                break;
            }
 
            int oldK = nextK;
            nextK = q.poll();
            if(oldK == -1) i += candidate[nextK].length;
            else i += (candidate[nextK].length - candidate[oldK].length);
        }

        String ans = isSuccess ? "YES" : "NO";
        System.out.println(ans);
    }
}