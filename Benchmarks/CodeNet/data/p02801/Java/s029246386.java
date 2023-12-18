import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextChar();
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(s.charAt(is(c) + 1));
    }
    static int is(char c) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<26; i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
    }
}
