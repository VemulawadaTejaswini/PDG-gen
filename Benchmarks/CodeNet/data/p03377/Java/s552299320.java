import java.io.*;
import java.util.*;

public class A {

    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int sum = a + b;
        if (x > sum) {
            System.out.println("NO");
            return;
        }
        if (x < a) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        return;
    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
