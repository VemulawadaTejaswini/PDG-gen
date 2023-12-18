import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.next();
        int yyyy = Integer.parseInt(S.substring(0, 4));
        int mm = Integer.parseInt(S.substring(5, 7));
        int dd = Integer.parseInt(S.substring(8, 10));
        sc.close();

        boolean heisei = false;
        if (yyyy < 2019) {
            heisei = true;
        } else if (yyyy == 2019) {
            if (mm <= 4) {
                heisei = true;
            }
        }
        if (heisei) {
            out.printf("Heisei\n");
        } else {
            out.printf("TBD\n");
        }
        out.flush();
    }
}
