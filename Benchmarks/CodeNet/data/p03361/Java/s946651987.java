import java.io.*;
import java.util.*;

public class Main {
    static boolean a[][];
    static int h, w;
    public static void main(String[] args) throws IOException {
        BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer t = new StringTokenizer(input.readLine());
        h = Integer.parseInt(t.nextToken());
        w = Integer.parseInt(t.nextToken());

        a = new boolean[h+2][w+2];
        for (int i=1; i<=h; i++) {
            String s = input.readLine();
            for (int j=1; j<=w; j++) {
                a[i][j] = s.charAt(j-1) == '#';
            }
        }
        System.out.println(check() ? "Yes" : "No");
    }

    static boolean check() {
        for (int i=1; i<=h; i++) {
            for (int j=1; j<=w; j++) {
                if (a[i][j]) {
                    if (!round(i,j)) return false;
                }
            }
        }
        return true;
    }
    
    static boolean round(int i, int j) {
        if (a[i+1][j]) return true;
        if (a[i-1][j]) return true;
        if (a[i][j+1]) return true;
        if (a[i][j-1]) return true;
        return false;
    }
}
