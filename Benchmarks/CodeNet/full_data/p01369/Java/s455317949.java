import java.util.Scanner;

public class Main {
    static final int RIGHT = 1;
    static final int LEFT = 0;
    static final char NULL = '\0';

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String tmp = sc.next();
            if (tmp.equals("#"))
                break;
            char inps[] = tmp.toCharArray();
            int hand = -1;
            int ans = 0;
            for (int i = 0; i < inps.length; i++) {
                switch (inps[i]) {
                case 'y':
                case 'u':
                case 'i':
                case 'o':
                case 'l':
                case 'k':
                case 'j':
                case 'p':
                case 'h':
                case 'm':
                case 'n':
                    if (hand == LEFT) {
                        hand = RIGHT;
                        ans++;
                    } else
                        hand = RIGHT;
                    break;
                case 'q':
                case 'w':
                case 'e':
                case 'r':
                case 't':
                case 'a':
                case 's':
                case 'd':
                case 'f':
                case 'g':
                case 'z':
                case 'x':
                case 'c':
                case 'v':
                case 'b':
                    if (hand == RIGHT) {
                        hand = LEFT;
                        ans++;
                    } else
                        hand = LEFT;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}