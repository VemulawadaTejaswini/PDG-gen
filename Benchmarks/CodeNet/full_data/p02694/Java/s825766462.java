import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long x = Long.parseLong(br.readLine());

        br.close();

        long now = 100;
        int ans = 0;

        while (now < x) {
            now = (long) (now * 1.01);
            ans++;
        }

        bw.write(String.valueOf(ans));

        bw.flush();

    }
}