import java.io.*;
import java.util.*;

public class Main {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    void solve() throws IOException {
        Integer n = Integer.valueOf(bf.readLine());
        Set<String> set = new HashSet<>();
        for (Integer i = 0; i < n; i++) {
            String[] input = bf.readLine().split(" ");
            String command = input[0];
            String str = input[1];
            if (command.equals("insert")) {
                set.add(str);
            } else if (command.equals("find")) {
                System.out.println(set.contains(str) ? "yes" : "no");
            }
        }
    }

    public static void main(String[] args) {
        try {
            new Main().solve();
        }catch (Exception e) {
            //
        }
    }
}

