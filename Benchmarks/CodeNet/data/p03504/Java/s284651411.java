import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] s = new int[100001];
        int[] e = new int[100001];
        for (int i = 0; i < n; i++) {
            int sd = sc.nextInt()-1;
            int ed = sc.nextInt();
            int cd = sc.nextInt();
            s[sd]++; e[ed]++;
        }

        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < 100001; i++) {
            cnt += s[i];
            cnt -= e[i];
            if(ans < cnt) ans = cnt;
        }
        System.out.println(ans);
        sc.close();

    }

}
