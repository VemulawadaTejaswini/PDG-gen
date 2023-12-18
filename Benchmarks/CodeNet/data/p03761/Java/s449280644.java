import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ar = new int[N][26];
        String[] Sa  = new String[N];
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            for (char c : S.toCharArray()) {
                ar[i][c-'a']++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                min = Math.min(min, ar[j][i]);
            }
            for (int j = 0; j < min; j++) {
                sb.append((char) (i + 'a'));
            }
        }
        System.out.println(sb);
    }

}