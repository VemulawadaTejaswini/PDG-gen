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

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int k = Integer.parseInt(in[1]);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            int d = Integer.parseInt(br.readLine());
            in = br.readLine().split(" ");
            for (int j = 0; j < d; j++) {
                set.add(Integer.parseInt(in[j]));
            }
        }

        br.close();

        bw.write(String.valueOf(n - set.size()));

        bw.flush();

    }
}