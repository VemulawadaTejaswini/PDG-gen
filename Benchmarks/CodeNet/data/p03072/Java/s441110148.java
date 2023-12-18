import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");
        int ans = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            int h = Integer.parseInt(tmp[i]);
            if(max <= h) {
                ans++;
                max = h;
            }
        }

        System.out.println(ans);
    }
}