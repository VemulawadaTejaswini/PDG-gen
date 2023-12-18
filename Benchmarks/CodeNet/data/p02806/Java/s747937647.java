import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        int[] t = new int[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }
        String X = sc.next();

        int from = 0;
        for (int i = 0; i < N; i++) {
            if (s[i].equals(X)) {
                from = i+1;
            }
        }

        int ans = 0;
        for (int i = from; i < N; i++) {
            ans += t[i];
        }

        System.out.println(ans);
    }
}
