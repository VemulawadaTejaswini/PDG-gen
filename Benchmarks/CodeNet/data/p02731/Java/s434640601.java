import java.io.*;

/**
 * Created by Ayushi on 22 Mar 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        float n = Integer.parseInt(temp);
        br.close();

        float a = n/3;
        float ans = a * a * a;
        System.out.println(ans);
    }
}
