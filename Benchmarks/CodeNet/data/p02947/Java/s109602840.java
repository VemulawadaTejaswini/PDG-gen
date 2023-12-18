import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] ary = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] c = new char[10];
            c = s.toCharArray();
            Arrays.sort(c);
            ary[i] = new String(c);
        }
        long ans = 0L;
        s:for (int i = 0; i < n; i++) {
            d:for (int j = i + 1; j <= n - 1; j++) {
                if (ary[i].equals(ary[j])) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}