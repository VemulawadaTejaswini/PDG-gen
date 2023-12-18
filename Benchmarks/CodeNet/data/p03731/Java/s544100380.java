import java.util.*;

public class Main {
    static int modP = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] T = new int[n];
        for(int i = 0; i < n; i++) T[i] = in.nextInt();

        int ans = 0;
        for(int i = 0; i < n-1; i++) {
            int d = T[i+1] - T[i];
            if(d < t) {
                ans += d;
            }else{
                ans += t;
            }
        }
        ans += t;
        print(ans);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }
}
