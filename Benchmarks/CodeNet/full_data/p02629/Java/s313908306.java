import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        StringBuilder sb = new StringBuilder();

        long divideN = N / 26;
        int modN = (int) N % 26;
        if (modN <= 0) {
            sb.insert(0, "z");
            divideN -= 1;
        } else {
            sb.insert(0, alphabet[modN - 1]);
        }

        while (divideN > 0) {
            modN = (int) divideN % 26;
            divideN /= 26;
            if (modN <= 0) {
                sb.insert(0, "z");
                divideN -= 1;
            } else {
                sb.insert(0, alphabet[modN - 1]);
            }
        }

        System.out.println(sb.toString());

    }
}