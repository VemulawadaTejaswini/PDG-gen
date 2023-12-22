import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 31 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        double n = Long.parseLong(st.nextToken());
        double m = Double.parseDouble(st.nextToken());
        br.close();
        long ans = (long) (n*m);
        System.out.println(ans);
    }
}
