import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = sc.next().toCharArray();
        int r = 0;
        int g = 0;
        int b = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'R') r++;
            if (c[i] == 'G') g++;
            if (c[i] == 'B') b++;
        }

        //総数
        long ans = r*g*b;

        //(i,j,k)の中でiの位置を固定する。
        for (int i = 0; i < n - 2; i++) {
            //(i,j,k)の中でjの位置を固定する。つまりkの位置を決まる。
            for (int j = i + 1; (j-i) * 2 + i < n; j++) {
                int k = j + (j-i);
                if (c[i] != c[j] && c[k] != c[j] && c[i] != c[k]) {
                    ans--;
                }
            }
        }
        System.out.println(ans);
    }
}
