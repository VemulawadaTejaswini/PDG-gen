import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().start();
    }

    void start() throws Exception {
        start(new Scanner(System.in));
    }

    boolean isMatch(String sd, String t, int offset) {
        for (int i = offset; i < offset + t.length(); ++i) {
            char c = sd.charAt(i);
            if (c != '?') {
                if (c != t.charAt(i - offset)) return false;
            }
        }
        return true;
    }

    void start(Scanner sc) throws Exception{
        String sd = sc.next();
        String t = sc.next();
        List<String> candidates = new ArrayList<>();

        if (sd.length() < t.length()) {
            System.out.println("UNRESTORABLE");
        }
        else {
            for (int offset = 0; offset <= (sd.length() - t.length()); ++offset) {
                if (isMatch(sd, t, offset)) {
                    candidates.add((sd.substring(0, offset) + t + sd.substring(offset + t.length())).replace('?', 'a'));
                }
            }
            Collections.sort(candidates);
            if (candidates.isEmpty())
                System.out.println("UNRESTORABLE");
            else
                System.out.println(candidates.get(0));
        }
    }
}