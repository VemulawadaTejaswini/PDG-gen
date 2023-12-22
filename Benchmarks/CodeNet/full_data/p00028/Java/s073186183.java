import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static int MAX_INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line;
        int[] a = new int[101];
        while ((line = in.readLine()) != null) {
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            a[n]++;
        }
        
        int c = 0;
        for (int i = 1; i <= 100; i++) {
            if (c < a[i]) {
                c = a[i];
            }
        }
        
        for (int i = 1; i <= 100; i++) {
            if (c == a[i]) {
                System.out.println(i);
            }
        }
    }
}
