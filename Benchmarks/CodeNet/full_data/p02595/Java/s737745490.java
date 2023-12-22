import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] data = in.readLine().split(" ");
        int n = Integer.parseInt(data[0]);
        long d = Integer.parseInt(data[1]);
        long dd = d * d;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            data = in.readLine().split(" ");
            long x = Integer.parseInt(data[0]);
            long y = Integer.parseInt(data[1]);
            if (x*x + y*y <= dd) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}