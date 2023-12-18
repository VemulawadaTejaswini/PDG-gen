import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int alp = 26;
            int num = alp;
            int[] a = new int[num];

            Arrays.fill(a, 0);

            for (int i = 0; i < s.length(); i++) {
                if (num == 0) break;
                if (0 == a[s.charAt(i) - 'a']) {
                    num--;
                    a[s.charAt(i) - 'a'] = 1;
                }
            }

            if (num == 0) {
                System.out.println("None");
            } else {
                for (int i = 0; i < alp; i++) {
                    if (a[i] == 0) {
                        System.out.println((char)('a' + i));
                        break;
                    }
                }
            }
        }
    }
}
