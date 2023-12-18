import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int r_count[] = new int[N+1];
        int g_count[] = new int[N+1];
        int b_count[] = new int[N+1];
        r_count[N]=0;
        g_count[N]=0;
        b_count[N]=0;
        for(int i=N-1; i>=0; i--) {
            char tmp = S.charAt(i);
            r_count[i]=r_count[i+1] + (tmp=='R' ? 1 : 0);
            g_count[i]=g_count[i+1] + (tmp=='G' ? 1 : 0);
            b_count[i]=b_count[i+1] + (tmp=='B' ? 1 : 0);
        }
        long result = 0L;
        result += count(S, 'R', 'G', 'B', r_count, g_count, b_count);
        result += count(S, 'R', 'B', 'G', r_count, b_count, g_count);
        result += count(S, 'G', 'R', 'B', g_count, r_count, b_count);
        result += count(S, 'G', 'B', 'R', g_count, b_count, r_count);
        result += count(S, 'B', 'R', 'G', b_count, r_count, g_count);
        result += count(S, 'B', 'G', 'R', b_count, g_count, r_count);
        System.out.println(String.format("%d", result));
    }
    static long count(String S, char A, char B, char C, int[] a_arr, int[] b_arr, int[] c_arr) {
        long result = 0L;
        for(int a=0; a<S.length(); a++) {
            char tmp_a = S.charAt(a);
            if(tmp_a !=A) continue;
            for(int b=a+1; b<S.length()-1; b++) {
                char tmp_b = S.charAt(b);
                if(tmp_b!=B) continue;
                result+=c_arr[b+1];
                if(b+(b-a)<S.length() && S.charAt(b+(b-a))==C) result--;
            }
        }
        return result;
    }
}
