import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        long r = 0;
        char si,sj,sk;
        int temp;
        for (int k = 0; k < n; k++) {
            sk = s.charAt(k);
            for (int j = 0; j < k; j++) {
                if (j >= k) continue;
                sj = s.charAt(j);
                if (sk == sj) continue;
                temp = 2 * j - k;
                for (int i = 0; i < j; i++) {
                    if (i >= j) continue;
                    si = s.charAt(i);
                    if (sk == si || sj == si) continue;
                    if (temp == i) continue;
                    r++;
                }
            }
        }
        System.out.println(r);
    }

}