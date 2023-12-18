import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int[] sa = new int[26];
        int[] ta = new int[26];
        Arrays.fill(sa, -1);
        Arrays.fill(ta, -1);
        for (int i = 0; i < s.length(); i++) {
            int si = s.charAt(i) - 'a';
            int ti = t.charAt(i) - 'a';
            if (sa[si] != -1 || ta[ti] != -1) {
                if (!(sa[si] == ti && ta[ti] == si)) {
                    System.out.println("No");
                    return;
                }
            } else {
                sa[si] = ti;
                ta[ti] = si;
            }
        }
        System.out.println("Yes");
    }
}