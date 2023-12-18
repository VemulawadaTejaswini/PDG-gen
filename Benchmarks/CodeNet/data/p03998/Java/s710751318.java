import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) s[i] = sc.next();
        int[] size = new int[3];
        for (int i = 0; i < 3; i++) size[i] = s[i].length();
        int[] cursor = new int[3];
        char ch = 'a';
        while (true) {
            int n = ch - 'a';
            if (cursor[n] >= size[n]) {
                System.out.println((char) ('A' + n));
                return;
            } else {
                ch = s[n].charAt(cursor[n]);
                cursor[n]++;
            }
        }
    }
}