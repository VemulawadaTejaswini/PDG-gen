import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                    case 'c':
                    c++;
                    break;
            }
        }
        int max = Math.max(a, Math.max(b, c));
        System.out.println(2 * max <= s.length() ? "YES" : "NO");
    }
}