import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] right = new int[S.length()+1];
        int[] left = new int[S.length()+1];
        int now = 0;
        int nowl = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '<') {
                right[i] = now;
                now++;
            } else {
                right[i] = now;
                now = 0;
            }
            if (S.charAt(S.length()-1-i) == '>') {
                left[S.length()-i] = nowl;
                nowl++;
            } else {
                left[S.length()-i] = nowl;
                nowl = 0;
            }
        }
        right[S.length()] = now;
        left[S.length()] = nowl;
        long ans = 0;
        for (int i = 0; i < right.length; i++) {
            ans += Math.max(right[i], left[i]);
        }
        System.out.println(ans);
    }
}