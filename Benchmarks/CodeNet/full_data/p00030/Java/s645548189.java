import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int MAX_INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line;
        while ((line = in.readLine()) != null) {
            st = new StringTokenizer(line, " ");
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            if (n == 0 && s == 0) {
                break;
            }
            System.out.println(dfs(n, s, 0));
        }
    }
    
    static int dfs(int n, int s, int cur) {
        if (n == 0 && s == 0) {
            return 1;
        } 
        if (n == 0 || s < 0 || cur > 9) {
            return 0;
        }
        int ans = 0;
        for (int i = cur; i <= 9; i++) {
            ans += dfs(n - 1, s - i, i + 1);
        }
        return ans;
    }
}
