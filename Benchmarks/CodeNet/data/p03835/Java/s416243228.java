import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int k = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);
        int ans = 0;
        
        for (int x = 0; x <= k; x++) {
            for (int y = 0; y <= k; y++) {
                for (int z = 0; z <= k; z++) {
                    if (x + y + z == s) ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}
