import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = Integer.MAX_VALUE;
        for(int cnt = 0; cnt<s.length(); cnt++) {
            char c = s.charAt(cnt);
            int maxlen = cnt+1;
            int pre = cnt;
            for(int i = 0; i<s.length(); i++) {
                if(c == s.charAt(i)) {
                    maxlen = Math.max(maxlen, i-pre-1);
                    pre = i;

                }
            }
            maxlen = Math.max(maxlen, s.length()-pre-1);
            ans = Math.min(ans, maxlen);
        }
        System.out.println(ans);

    }
}