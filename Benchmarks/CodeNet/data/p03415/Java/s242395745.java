import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] s = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j] = sc.next();
            }
        }
        System.out.print(s[0][0] + s[1][1] + s[2][2]);
    }
}
