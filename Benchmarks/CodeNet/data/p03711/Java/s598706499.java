import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();
        int g1[] = {1, 3, 5, 7, 8, 10, 12};
        int g2[] = {4, 6, 9, 11};
        int g3[] = {2};
        int xg = 0; int yg = 0;
        for (int i = 0; i < 7; i++) {
            if (g1[i] == x) {
                xg = 1;
            }
            if (g1[i] == y) {
                yg = 1;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (g2[i] == x) {
                xg = 2;
            }
            if (g2[i] == y) {
                yg = 2;
            }
        }
        if (2 == x) {
            xg = 3;
        }
        if (2 == y) {
            yg = 3;
        }
        System.out.println(xg == yg ? "Yes" : "No");
    }
}