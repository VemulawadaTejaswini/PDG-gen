import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String ans = "";

        while (n > 0) {
            int r = (int)(n % 26l);
            if (r == 0) {
                r = 26;
                n = n - 1l;
            }
            ans = str[r - 1] + ans;
            n = n / 26l;
        }

        System.out.println(ans);
    }
}