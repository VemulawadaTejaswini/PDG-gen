import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(s.charAt(is(c.charAt(0)) + 1));
    }
    static int is(char c) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int re = -1;
        for (int i=0; i<26; i++) {
            if (s.charAt(i) == c) {
                re = i;
            }
        }
        return re;
    }
}
