import java.io.*;

/**
 * Created by Ayushi on 10 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        if ((a+b.charAt(b.length()-1)).equals(b)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        br.close();
    }
}
