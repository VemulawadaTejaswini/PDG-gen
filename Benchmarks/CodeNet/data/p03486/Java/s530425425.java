import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String[] s_char = s.split("", 0);
        String[] t_char = t.split("", 0);

        Arrays.sort(s_char, Comparator.reverseOrder());
        Arrays.sort(t_char, Comparator.reverseOrder());

        int n = s.length();
        int m = t.length();

        String s_prime = "";
        String t_prime = "";
        for (int i = 0; i < n; i++) {
            s_prime += s_char[i];
        }
        for (int i = 0; i < m; i++) {
            t_prime += t_char[i];
        }

        if (s_prime.compareTo(t_prime) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}