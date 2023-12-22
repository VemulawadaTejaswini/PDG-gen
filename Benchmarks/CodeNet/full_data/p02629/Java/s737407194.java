import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        char[] map = new char[26];
        for (int i = 0; i < 26; i++) {
            map[i] = (char) (i + 'a' );
        }

        StringBuilder sb =new StringBuilder();
        while (n != 0) {
            int amari = (int) (n % 26) -1;
            sb.append(map[amari]);
            n /= 26;
        }

        System.out.println(sb.reverse().toString());
    }
}
