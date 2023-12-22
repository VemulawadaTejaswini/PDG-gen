import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        long d = Long.parseLong(s[1]);
        d *= d;
        int count = 0;
        for(int i=0; i<n; i++) {
            s = br.readLine().split(" ");
            long x = Long.parseLong(s[0]);
            long y = Long.parseLong(s[1]);
            if(x*x + y*y <= d)
                count++;
        }
        System.out.print(count);
    }
}