import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        char[][] c = new char[n][n];
        for (int i=0; i<n; i++) {
            String s =  input.readLine();
            for (int j=0; j<n; j++) {
                c[i][j] = s.charAt(j);
            }
        }

        int count = 0;
        for (int i=0; i<n; i++) {
            if (sym(n, c, i)) count += n;
        }
        System.out.println(count);
    }


    static boolean sym(int n, char c[][], int offset) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int x = (j + offset + n) % n;
                int y = (i - offset + n) % n;
                if (c[i][j] != c[x][y]) return false;
            }
        }
        return true;
    }
}
