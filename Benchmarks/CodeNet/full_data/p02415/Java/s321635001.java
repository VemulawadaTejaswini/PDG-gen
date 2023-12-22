import java.util.Scanner;

public class Main {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        while (S.hasNext()) {
            String s = S.nextLine();
            print(s);
        }
    }

    static String swap(String x) {
        int i = 0;
        String[] s = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        String[] b = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z" };

        while (i < s.length && !x.equals(s[i]))
            i++;
        if (i < s.length)
            return b[i];

        i = 0;
        while (i < b.length && !x.equals(b[i]))
            i++;
        if (i < b.length)
            return s[i];

        return x;
    }

    static void print(String s) {
        String sc = "";
        int i;
        String x;
        for (i = 0; i < s.length(); i++) {
            x = s.substring(i, i + 1);
            x = swap(x);
            sc += x;
        }
        System.out.println(sc);
    }

}
