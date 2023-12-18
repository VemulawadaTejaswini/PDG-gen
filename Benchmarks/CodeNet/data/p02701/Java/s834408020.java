import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 26 Apr 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        int ans = 0;
        while (n-- > 0) {
            String a = br.readLine();
            if (!arr.contains(a)) {
                ans++;
                arr.add(a);
            }
        }
        br.close();
        System.out.println(ans);
    }
}
