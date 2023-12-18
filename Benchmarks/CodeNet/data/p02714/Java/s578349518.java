import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.nextInt();
        var s = sc.next().toCharArray();

        int[] counts = new int[3];
        for (int i = 0; i < n; i++) {
            if (s[i] == 'R') counts[0]++;
            if (s[i] == 'G') counts[1]++;
            if (s[i] == 'B') counts[2]++;
        }
        long ans = counts[0] * counts[1] * counts[2];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                var k = j + (j - i);
                if (k >= n) continue;
                if (s[i] == s[j]) continue;
                if (s[j] == s[k]) continue;
                if (s[k] == s[i]) continue;
                ans--;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}