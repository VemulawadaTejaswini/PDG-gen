import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        
        long ans = 0;

        if(a >= 0 && c >= 0) {
            ans = b * d;
        } else if(a >= 0 && d <= 0) {
            ans = a * d;
        } else if(b <= 0 && d <= 0) {
            ans = a * c;
        } else if(b <= 0 && c >= 0) {
            ans = b * c;
        }

        pw.println(ans);
        br.close();
        pw.close();
    }
}