import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        bw.write(s);
        if (s.charAt(s.length() - 1) == 's') {
            bw.write('e');
        }
        bw.write('s');
        bw.newLine();

        bw.close();
        br.close();
    }
}
