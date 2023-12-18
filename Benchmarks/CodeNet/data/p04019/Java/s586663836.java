import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.next();
        sc.close();
        int N = S.length();
        char[] course = new char[N];
        course = S.toCharArray();
        boolean north = false;
        boolean south = false;
        boolean east = false;
        boolean west = false;
        for (int i = 0; i < N; i++) {
            if (course[i] == 'N') {
                north = true;
            }
            else if (course[i] == 'W') {
                west = true;
            }
            else if (course[i] == 'S') {
                south = true;
            }
            else {
                east = true;
            }
            if (north && south && east && west) {
                break;
            }
        }
        if (north == south && east == west) {
            out.printf("Yes\n");
        } else {
            out.printf("No\n");
        }
        out.flush();
    }
}
