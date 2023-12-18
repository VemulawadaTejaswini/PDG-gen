import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count[] = new int[n];
        for (int i = 1; i < n; i++) {
            String a = s.substring(0, i);
            String b = s.substring(i, n);
            int ac[] = new int[26];
            int bc[] = new int[26];
            for (int j = 0; j < i; j++) {
                ac[a.charAt(j) - 'a'] = 1;
            }
            for (int j = 0; j < n - i; j++) {
                bc[b.charAt(j) - 'a'] = 1;
            }
            for (int j = 0; j < 26; j++) {
                if (ac[j] == 1 && bc[j] == 1) {
                    count[i]++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, count[i]);
        }
        System.out.println(max);
    }
}