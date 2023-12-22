import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 26 Apr 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        br.close();
        for (int i = 0; true; i++) {
            if (i % 2 == 0) {
                c = c-b;
                if (c <= 0) {
                    System.out.println("Yes");
                    break;
                }
            }
            else {
                a = a-d;
                if (a <= 0) {
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}
