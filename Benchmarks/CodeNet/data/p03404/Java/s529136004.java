import java.util.*;
import java.util.stream.Stream;

public class Main {
    static  char[][] ret = new char[100][100];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt() - 1;
        int b = scan.nextInt() - 1;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                ret[i][j] = '#';
            }
            for (int j = 0; j < 100; j++) {
                ret[i+50][j] = '.';
            }

        }

        int ar = a / 50;
        int al = a % 50;
        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < 50; j++) {
                ret[2*i][2*j] = '.';
            }
        }
        for (int i = 0; i < al; i++) {
            ret[2*ar][2*i] = '.';
        }

        int br = b / 50;
        int bl = b % 50;
        for (int i = 0; i < br; i++) {
            for (int j = 0; j < 50; j++) {
                ret[2*i+51][2*j] = '#';
            }
        }
        for (int i = 0; i < bl; i++) {
            ret[2*br+51][2*i] = '#';
        }
        System.out.println("100 100");
        for (int i = 0; i < 100; i++) {
            System.out.println(new String(ret[i]));
        }
    }

}
