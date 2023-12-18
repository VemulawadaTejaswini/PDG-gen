import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long k = in.nextInt();
        int n = s.length();

        boolean same = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(0)) {
                same = false;
                break;
            }
        }

        if (same) {
            System.out.println((k * n) / 2);
            return;
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
        }

        if (s.charAt(0) == s.charAt(n - 1)) {
            int loop = 0;
            char c = s.charAt(0);
            int i = 0;
            while (i < n && s.charAt(i) == c) {
                i++;
            }
            loop = (i + 1) / 2;

            int j = n - 1;
            while (j >= 0 && s.charAt(j) == c) {
                j--;
            }
            loop += (n - j) / 2;
            loop -= (i + 1 + n - j) / 2;
            count -= (k - 1) * loop;
        }

        System.out.println(k * count);
    }
}