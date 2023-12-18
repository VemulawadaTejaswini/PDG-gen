import java.util.*;

public class Main {
        static int x;
        static int y;
        static int x2 = 0;
        static int y2 = 0;
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                x = sc.nextInt();
                y = sc.nextInt();
                if (curv(s.split("T"), 0)) {
                        System.out.println("Yes");
                } else {
                        System.out.println("No");
                }
        }

        public static boolean curv(String[] s2, int i) {
                if (i == s2.length) {
                        if (x == x2 && y == y2) {
                                return true;
                        } else {
                                return false;
                        }
                }
                if (i % 2 == 0) {
                        x2 += s2[i].length();
                        if (curv(s2, i + 1)) return true;
                        x2 -= 2 * s2[i].length();
                        if (curv(s2, i + 1)) return true;
                        x2 += s2[i].length();
                } else {
                        y2 += s2[i].length();
                        if (curv(s2, i + 1)) return true;
                        y2 -= 2 * s2[i].length();
                        if (curv(s2, i + 1)) return true;
                        y2 += s2[i].length();
                }
                return false;
        }
}
