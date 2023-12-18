
import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        List<Integer>[] sArr = new List[26];

        for (int i = 0 ; i  < 26; i++) {
            sArr[i] = new ArrayList<>();
        }

        for (int i = 0; i < s.length(); i++) {
            sArr[s.charAt(i) - 'a'].add(i);
        }

        long ans = 0;
        int currentIdx = -1;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (sArr[c - 'a'].isEmpty()) {
                break;
            }

            boolean canFind = false;
            for (int idx : sArr[c - 'a']) {
                if (currentIdx < idx) {
                    currentIdx = idx;
                    canFind = true;
                    break;
                }
            }

            if (!canFind) {
                currentIdx = sArr[c - 'a'].get(0);
                ans += s.length();
            }
        }


        System.out.println(currentIdx != -1 ? ans + currentIdx + 1: -1);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
