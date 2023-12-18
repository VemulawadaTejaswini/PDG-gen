import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] cnt = new int[1000000];

        for (int i=1; i<=n; i++) {
            int tmp = sc.nextInt()+1;
            cnt[tmp]++;
            cnt[tmp-1]++;
            cnt[tmp+1]++;
        }

        int ans = 0;

        for (int i=0; i<cnt.length; i++) {
            ans = Math.max(ans, cnt[i]);
        }

        System.out.println(ans);

    }
}