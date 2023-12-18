import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String s = reader.readLine();
        String t = reader.readLine();

        int len = s.length();
        for (int i = 0; i < t.length(); i++) {
            String tt = t.substring(0, t.length() - i);
            int pos = s.indexOf(tt);
            if (pos >= 0) {
                len += pos;
                if (len < N)
                    System.out.println(N);
                else
                    System.out.println(len);
                return;
            }
        }

        len += t.length();

        if (len < N)
            System.out.println(N);
        else
            System.out.println(len);

//        PrintWriter writer = new PrintWriter(System.out);
//
//        writer.close();


    }
}
