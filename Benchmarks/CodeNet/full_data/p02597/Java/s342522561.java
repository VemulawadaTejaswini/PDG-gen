import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int ans = 0;
        int r = N-1;
        for (int i = 0; i < N-1; i++) {
            if (c[i] != 'W') continue;
            for (; r > i; r--) {
                if (c[r] != 'R') continue;
                ans++;
                r--;
                break;
            }
        }
        System.out.println(ans);
    }
    
}
