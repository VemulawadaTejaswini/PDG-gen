import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] == 0) {
                System.out.println((char)(i + 'a'));
                System.exit(0);
            }
        }
        System.out.println("None");
    }
}
