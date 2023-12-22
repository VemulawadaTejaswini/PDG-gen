
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String line = reader.readLine();
        int x = Integer.parseInt(line);
        call(x,builder);
    }
    public static void call (int n ,StringBuilder builder ) {
        
        // 3??§?????????????????? ??????
        for ( int i = 1 ; i <= n; i++ ) {
            if ( i % 3 == 0 ) {
                builder.append(" " + i);
                continue;
            }
            if ( i % 10 == 3 ) {
                builder.append(" " + i);
            }
        }
        System.out.println(builder);
    }
}