import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    void solve() {
        int n = in.nextInt(); in.nextLine();
        String[] s = new String[n];
        for(int i = 0; i < n; i++) {
            s[i] = in.nextLine();
        }
        int m = in.nextInt(); in.nextLine();
        String[] t = new String[m];
        for(int i = 0; i < m; i++) {
            t[i] = in.nextLine();
        }
        int[] cnt = new int[n];
        for(int i = 0; i < n; i++) {
            int tmp = 0;
            for(int k = 0; k < n; k++){
                if(s[i].equals(s[k])) tmp++;
            }
            for(int k = 0; k < m; k++){
                if(s[i].equals(t[k])) tmp--;
            }
            cnt[i] = tmp;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, cnt[i]);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}
