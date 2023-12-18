import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String S = br.readLine();
        int ans = 0;

        Pattern p = Pattern.compile("ABC");
        while(p.matcher(S).find()) {
            String temp = S.replace("ABC", "XX");
            ans += S.length() - temp.length();
            S = temp.replace("XX", "BCA");
        }
        
        out.println(ans);
        out.close();
    }
}
