import java.io.*;

/**
 * Created by Ayushi on 27/07/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int[] in = new int[n];
        temp = r.readLine().split(" ");
        r.close();
        int wp = 0;
        for (int i = 0; i < n; i++) {
            in[i] = Integer.parseInt(temp[i]);
            if (in[i] != i+1) wp++;
        }

        if (wp > 2) System.out.println("NO");
        else System.out.println("YES");
    }
}
