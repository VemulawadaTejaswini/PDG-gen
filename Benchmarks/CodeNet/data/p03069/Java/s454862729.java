import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int ans = 0;
        int start = S.indexOf("#");
        if (start < 0) {
            out.println(0);
            out.close();
        } else {
     		for (int i = start; i < N; i++) {
            if ('.' == S.charAt(i)) {
                ans++;
            }
        }
        out.println(ans);
        out.close();
        }
    }
}
