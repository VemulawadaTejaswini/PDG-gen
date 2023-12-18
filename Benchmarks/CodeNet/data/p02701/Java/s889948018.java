import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            set.add(s);
        }

        br.close();

        bw.write(String.valueOf(set.size()));

        bw.flush();

    }
}