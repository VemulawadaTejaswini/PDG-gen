import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 13 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");
        long a = Integer.parseInt(st.nextToken());
        long v = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        long b = Integer.parseInt(st.nextToken());
        long w = Integer.parseInt(st.nextToken());
        long t = Integer.parseInt(br.readLine());
        br.close();

        if ((v*t) >= (b*w)+Math.abs(a-b)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
