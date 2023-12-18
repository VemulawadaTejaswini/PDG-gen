import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String w = cin.next();
        String allChars = "abcdefghijklmnopqrstuvwxyz";
        if (w.length() < 26) {
            int firstUnused = allChars
                    .chars()
                    .filter((int n) -> (w.indexOf(n) == -1))
                    .findFirst()
                    .orElse(-1);
            System.out.println(w + (char)firstUnused);
        } else {
            String rev = (new StringBuffer(allChars)).reverse().toString();
            if (rev.equals(w)) {
                System.out.println("-1");
                return;
            }

            StringBuffer buf = new StringBuffer(w);
            for (int i = w.length() - 1; i >= 0; i--) {
                int c = buf.charAt(i);
                buf.setLength(buf.length() - 1);
                if (c != (int)'z') {
                    for (int c2 = c + 1; c2 <= (int)'z'; c2++) {
                        if (buf.toString().indexOf(c + 1) == -1) {
                            System.out.println(buf.toString() + (char)(c + 1));
                            return;
                        }
                    }
                }
            }
        }
    }
}
