import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String board = s.next();
        int n = board.length();
        char prev = board.charAt(0);
        int a = 0;
        for (int i = 1; i < n; i++) {
            char c = board.charAt(i);
            if (c != prev) {
                a ++;
            }
            prev = c;
        }
        System.out.println(a);

    }


}
