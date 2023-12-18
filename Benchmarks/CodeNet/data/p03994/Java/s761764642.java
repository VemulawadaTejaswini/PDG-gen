
import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int move = sc.nextInt();
        int length = s.length();

        while (move != 0) {
            for (int i = 0; i < length; i++) {
                int num = s.charAt(i) - 'a';

                if (26 - num <= move) {
                    s = s.substring(0, i) + 'a' + s.substring(i + 1);
                    move -= 26 - num;
                }
                if (move == 0) break;
            }

            if (move == 0) break;

            move = move % 26;

            int num = s.charAt(length - 1) - 'a';
            char next = (char) (num + move + 'a');
            s = s.substring(0, length - 1) + next;
            break;
        }

        System.out.println(s);
    }
}