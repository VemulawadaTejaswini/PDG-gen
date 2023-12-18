import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int[] pos = new int[26];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            int[] check = new int[26];
            Arrays.fill(check, 0);
            for (int j = 0; j < s[i].length(); j++) {
                int tag = (int) s[i].charAt(j);
                check[tag - 97]++;
            }
            for (int j = 0; j < 26; j++) {
                if (i == 0) {
                    pos[j] = check[j];
                } else {
                    pos[j] = Math.min(pos[j], check[j]);
                }
            }

        }
        for (int i = 0; i < 26; i++) {
            while (pos[i] > 0) {
                System.out.print((char) (i + 97));
                pos[i]--;
            }
        }
        System.out.println();

    }
}