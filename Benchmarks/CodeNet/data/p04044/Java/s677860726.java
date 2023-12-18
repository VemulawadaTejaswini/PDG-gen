import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nl = br.readLine().split(" ");
        int n = Integer.parseInt(nl[0]);
        int l = Integer.parseInt(nl[1]);
        String[] s = new String[n];
        
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }
        Arrays.sort(s);
        String ans = String.join("", s);
        System.out.println(ans);
    }
}
