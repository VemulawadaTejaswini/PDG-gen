import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        char[][] s = new char[n][];
        int[][] az = new int[n][26];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().toCharArray();
            for (int j = 0; j < s[i].length; j++) {
                az[i][s[i][j] - 'a']++;
            }
        }
        int min;
        char c;
        for (int i = 0; i < 26; i++) {
            c = (char) ('a' + i);
            min = 50;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, az[j][i]);
            }
            for (int j = 0; j < min; j++) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}