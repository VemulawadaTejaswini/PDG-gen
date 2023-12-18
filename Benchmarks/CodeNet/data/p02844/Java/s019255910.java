import java.util.*;

class D {
    public static void main(String[] args) {
        final Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        String s = cin.next();

        int cnt = 0;
        for (int pin = 0; pin <= 999; pin++) {
            int pos = 100;
            for (int i = 0; i < s.length(); i++) {
                char c = (char) ((pin / pos) % 10 + '0');
                if (s.charAt(i) == c)
                    pos /= 10;
                if (pos == 0) break;
            }
            if (pos == 0) ++cnt;
        }
        System.out.println(cnt);
    }
}
