import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        long N=0, C=0, K=0;
        long[] ps = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] elems = br.readLine().split(" ");
            N = Long.parseLong(elems[0]);
            C = Long.parseLong(elems[1]);
            K = Long.parseLong(elems[2]);
            ps = new long[(int)N];
            for (int i = 0; i < ps.length; i++){
                elems = br.readLine().split(" ");
                ps[i] = Long.parseLong(elems[0]);;
            }
            Arrays.sort(ps);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int ans = 0;
        int count = 0;
        int bassPass = 0;
        long currentTime;
        long oldTime = ps[0];
        while (count < N) {
            currentTime = ps[count++];
            if (currentTime - oldTime> K) {
                ans++;
                bassPass = 1;
                oldTime = currentTime;
                continue;
            }
            if (++bassPass == C) {
                ans++;
                bassPass = 0;
                oldTime = ps[count];
                continue;
            }
            oldTime = currentTime;
        }
        System.out.println(++ans);
    }
}

