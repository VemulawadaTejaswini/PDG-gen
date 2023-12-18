import java.io.*;

/**
 * Created by Ayushi on 07/07/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        long l = Long.parseLong(temp[0]);
        long r = Long.parseLong(temp[1]);
        br.close();

        long ans = 2018;
        for (long i = l; i < r; i++) {
            for (long j = i+1; j <= r; j++) {
                ans = Math.min(ans, ((i*j) % 2019));
                if (ans == 0) break;
            }
        }

        System.out.println(ans);
    }
}
