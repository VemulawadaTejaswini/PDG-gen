import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        int[][] cnt = new int[n][26];
        for (int i = 0; i < n; i++) {
            String str = s[i];
            for (int j = 0; j < str.length(); j++) {
                cnt[i][str.charAt(j) - 'a']++;
            }
        }
        int[] ans = new int[26];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (i == 0) {
                    ans[j] = cnt[i][j];
                    continue;
                }
                ans[j] = Math.min(ans[j], cnt[i][j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (ans[i] == 0) {
                continue;
            }
            for (int j = 0; j < ans[i]; j++) {
                sb.append((char) (i + 'a'));
            }
        }
        System.out.println(sb.toString());
    }

}
