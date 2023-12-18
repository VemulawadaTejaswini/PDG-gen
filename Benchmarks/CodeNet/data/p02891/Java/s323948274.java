
import java.io.*;
import java.util.*;

public class Main {
    static boolean isLastChange = false;
    public static int countDiff(String s, boolean previousChanged) {
        int countChange = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1 < 0 ? s.length() - 1 : i - 1) && !previousChanged) {
                previousChanged = true;
                countChange++;
            } else {
                previousChanged = false;
            }
        }
        isLastChange = previousChanged;
        return countChange;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int times = sc.nextInt();
        int once = countDiff(s, true);
        if (times == 1) {
            System.out.println(once);
        } else {
            boolean firstTimeLastChange = isLastChange;
            int twice = countDiff(s, isLastChange);
            if (times == 2) {
                System.out.println(once + twice);
            } else {
                if (isLastChange == firstTimeLastChange) {
                    System.out.println(once + (long) twice * (times - 1));
                } else {
                    System.out.println((long) (times / 2) * (once + twice) + (times - times / 2 * 2) * once);
                }
            }
        }

    }


    static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}