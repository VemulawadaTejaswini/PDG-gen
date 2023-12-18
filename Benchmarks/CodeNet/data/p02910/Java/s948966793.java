import java.io.*;

/**
 * Created by Ayushi on 15/09/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] in = r.readLine().split("");
        int n = in.length;
        r.close();

        boolean ans = true;
        for (int i = 0; i < n && ans; i++) {
            if ((i % 2 == 0 && in[i].equals("L")) || (i % 2 == 1 && in[i].equals("R"))) {
                ans = false;
                //System.out.println("i+1 = " + (i+1));
                //System.out.println("in[i] = " + in[i]);
            }
        }

        System.out.println(ans? "Yes":"No");
    }
}
