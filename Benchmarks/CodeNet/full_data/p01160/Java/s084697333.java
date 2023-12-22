import java.io.*;
import java.util.*;

public class Main {
    String s;
    String[][] dp;
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    String drop(int from, int to) {
        //System.out.printf("%d,%d\n", from, to);
        if (dp[from][to] != "") return dp[from][to];
        if (to - from < 0) return "";
        if (to == from) return Character.toString(s.charAt(to));
        if (s.charAt(from) == s.charAt(to)) {
            return s.charAt(from) + drop(from+1, to-1) + s.charAt(to);
        }
        String drop_first = drop(from+1, to);
        String drop_last = drop(from, to-1);
    
        if (drop_first.length() < drop_last.length()) {
            return dp[from][to] = drop_last;
        } else {
            return dp[from][to] = drop_first;
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
    boolean init() {
        if (!sc.hasNext()) return false;
        s = sc.next();
        return true;
    }
    void run() {
        while (init()) {
            dp = new String[s.length()][s.length()];
            for (int i = 0; i < s.length(); i++) 
                for (int j = 0; j < s.length(); j++)
                    dp[i][j] = "";
            System.out.println(drop(0, s.length()-1));
        }
    }
}