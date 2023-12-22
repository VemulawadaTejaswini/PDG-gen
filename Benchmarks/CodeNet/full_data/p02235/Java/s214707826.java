import java.util.*;

public class Main {

    public static int lcs(String s0, String s1) {
        if (s0.length() == 0)
            return 0;
        else if (s1.length() == 0)
            return 0;
        else;
            int[][] cache = new int[s0.length() + 1][s1.length() + 1];
            for(int i = 1; i <= s0.length(); i++) {
                for(int j = 1; j <= s1.length(); j++) {
                    int left  = cache[i][j - 1];
                    int top   = cache[i - 1][j];
                    int diag  = cache[i - 1][j - 1];
                    diag     += s0.charAt(i-1) - s1.charAt(j-1) == 0? 1 : 0;
                    cache[i][j] = Math.max(left, Math.max(top, diag));
                }
            }
            return cache[s0.length()][s1.length()];
    }
    
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++) {
            System.out.println(lcs(sc.next(), sc.next()));
        }
        sc.close();
    }
}

